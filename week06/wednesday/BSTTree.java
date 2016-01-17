package wednesday;

import java.util.LinkedList;
import java.util.Queue;

public class BSTTree {

	private BSTNode head;

	public BSTTree() {
		head = null;
	}

	public void insert(int data) {
		head = insert(head, data);
	}

	private int max(int a, int b) {
		return (a > b) ? a : b;
	}

	private int height(BSTNode node) {
		if (node == null)
			return -1;
		return node.height;
	}

	private int getBalance(BSTNode node) {
		if (node == null)
			return 0;
		return height(node.left) - height(node.right);
	}

	public int getDepth(BSTNode node) {
		if (node == head)
			return 0;
		return node.depth;
	}

	int i = 0;

	private BSTNode insert(BSTNode node, int data) {
		i++;
		BSTNode parent = new BSTNode(0);
		if (node == null) {
			return (new BSTNode(data));
		}

		if (data < node.data) {
			node.left = insert(node.left, data);
			if (node.left == null) {
				parent = node.left;
			}
		} else {
			node.right = insert(node.right, data);
			if (node.right == null) {
				parent = node.right;
			}
		}

		// Update height node
		node.height = max(height(node.left), height(node.right)) + 1;
		node.depth = i;
		i = 0;

		return node;
	}

	public void delete(int key) {
		head = deleteNode(head, key);
	}

	private BSTNode deleteNode(BSTNode root, int key) {
		// Normal BST deletion

		if (root == null) {
			return root;
		}

		// If the key is smaller it should be in the left sub-tree
		if (key < root.data) {
			root.left = deleteNode(root.left, key);
		}

		// If the key is smaller it should be in the left sub-tree
		else if (key > root.data) {
			root.right = deleteNode(root.right, key);
		}

		// If we found the desired data matching key
		else {
			if (root.right == null) {
				root = root.left;
			} else {
				BSTNode temp = minValueNode(root.right);
				root.data = temp.data;
				root.right = deleteNode(root.right, temp.data);
			}
		}

		// If the tree had only one node then return
		if (root == null) {
			return root;
		}

		// update height
		root.height = max(height(root.left), height(root.right)) + 1;

		return root;
	}

	private BSTNode minValueNode(BSTNode node) {
		BSTNode current = node;

		// loop to find the leftmost leaf of the right sub-tree
		while (current.left != null)
			current = current.left;

		return current;
	}

	private void inorder(BSTNode node) {
		if (node != null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}

	public BSTNode searchRecursively(int key) {
		return searchRecursively(key, head);
	}

	private BSTNode searchRecursively(int key, BSTNode currentNode) {
		if (currentNode.data == key) {
			return currentNode;
		} else if (currentNode.data > key) {
			return searchRecursively(key, currentNode.left);
		} else {
			return searchRecursively(key, currentNode.right);
		}
	}

	public int size() {
		return countNodes(head);
	}

	private int countNodes(BSTNode currentNode) {
		if (currentNode == null)
			return 0;
		else {
			int counter = 1;
			counter += countNodes(currentNode.left);
			counter += countNodes(currentNode.right);
			return counter;
		}
	}

	private void BFS_Tree(BSTNode root) {
		Queue<BSTNode> q = new LinkedList<BSTNode>();
		if (root == null)
			return;
		q.add(root);
		while (!q.isEmpty()) {
			BSTNode n = (BSTNode) q.remove();
			System.out.print(" " + n.data);
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
	}

	public void print() {
		BFS_Tree(head);
		System.out.println();
	}

	class BSTNode {
		BSTNode right;
		BSTNode left;
		int data;
		int height;
		int depth;

		BSTNode(int n) {
			right = null;
			left = null;
			data = n;
			height = 0;
			depth = 0;
		}

	}

	public static void main(String[] args) {

		BSTTree tree = new BSTTree();
		tree.insert(10);
		tree.insert(13);
		tree.insert(17);
		tree.insert(5);
		tree.insert(4);
		tree.insert(6);
		tree.insert(3);
		tree.insert(2);
		tree.print();
		tree.delete(2);
		tree.print();
		System.out.println(tree.getDepth(tree.searchRecursively(6)));

	}

}
