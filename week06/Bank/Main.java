package Bank;

import java.util.Scanner;

import javax.activity.InvalidActivityException;

public class Main {

	public static void main(String[] args) {
		while (true) {
			try {
				initBankAccount(inputInterest());
			} catch (InvalidActivityException e) {
				continue;
			}
			break;
		}

	}

	public static double inputInterest() {
		System.out.println("Enter interest");
		Scanner scanner = new Scanner(System.in);
		double interest = scanner.nextDouble();
		return interest;
	}

	public static void initBankAccount(double inter)
			throws InvalidActivityException {
		Owner owner = new Owner("Ivan", "Ivanov", 18);
		BankAccount account = new BankAccount(owner, 1000, inter, true);
	}
}
