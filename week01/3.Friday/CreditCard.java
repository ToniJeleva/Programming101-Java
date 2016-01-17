package week1;

public class CreditCard {

	public static void main(String[] args) {
		System.out.println(isCreditCardValid("79927398715"));

	}

	public static boolean isCreditCardValid(String n) {
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			if (i % 2 == 0) {
				sum = sum + Integer.parseInt(n.charAt(i) + "");
			} else {
				sum = sum + Integer.parseInt(n.charAt(i) + "") * 2;
			}
		}
		if (sum % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
