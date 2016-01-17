package wednesday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunnyArraySorter {
	private Integer pivot;

	public FunnyArraySorter(int p) {
		pivot = p;
	}

	public List<Integer> getSortedList(List<Integer> unsorted) {
		List<Integer> sorted = new ArrayList<>();
		sorted.addAll(unsorted);
		Collections.sort(sorted);
		return sorted;

	}

	public List<Integer> getReverseSortedList(List<Integer> unsorted) {
		List<Integer> sorted = new ArrayList<>();
		sorted.addAll(unsorted);
		Collections.sort(sorted, new Comparator<Integer>() {
			@Override
			public int compare(Integer first, Integer second) {
				if (first.compareTo(second) > 0) {
					return -1;
				} else if (first.compareTo(second) < 0) {
					return 1;
				} else {
					return 0;
				}
			}

		});
		return sorted;

	}

	public List<Integer> pivotSubtractionSort(List<Integer> unsorted) {
		List<Integer> sorted = new ArrayList<>();
		sorted.addAll(unsorted);
		Collections.sort(sorted, new Comparator<Integer>() {
			@Override
			public int compare(Integer first, Integer second) {
				if ((first - pivot) > second) {
					return 1;
				} else if ((first - pivot) == second) {
					return 0;
				} else {
					return -1;
				}
			}

		});
		return sorted;
	}

	public List<Integer> pivotDivisionSort(List<Integer> unsorted) {
		List<Integer> sorted = new ArrayList<>();
		sorted.addAll(unsorted);
		Collections.sort(sorted, new Comparator<Integer>() {
			@Override
			public int compare(Integer first, Integer second) {
				if ((first / pivot) > second) {
					return 1;
				} else if ((first / pivot) == second) {
					return 0;
				} else {
					return -1;
				}
			}

		});
		return sorted;
	}

	public static void main(String[] args) {
		ArrayList<Integer> toBeSorted = new ArrayList<>();
		ArrayList<Integer> sorted = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			toBeSorted.add(i);
		}
		FunnyArraySorter sorter = new FunnyArraySorter(0);
		sorted = (ArrayList<Integer>) sorter.getReverseSortedList(toBeSorted);
		for (int i = 0; i < sorted.size(); i++) {
			System.out.println(sorted.get(i));

		}

	}

}
