package Bank;

import javax.activity.InvalidActivityException;

public class BankAccount {

	private Owner person;
	private double balance;
	private double interest;
	private boolean simpleInterest;

	public BankAccount(Owner p, double bal, double inter, boolean simple)
			throws InvalidActivityException {
		setPerson(p);
		setBalance(bal);
		setInterest(inter);
		setSimpleInterest(simple);

	}

	public void add() {

	}

	public Owner getPerson() {
		return person;
	}

	public void setPerson(Owner person) {
		if (person == null) {
			throw new NullPointerException("No owner.");
		}
		this.person = person;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) throws InvalidActivityException {
		if (balance < 0) {
			throw new InvalidActivityException();
		}
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) throws InvalidActivityException {
		if (interest < 0) {
			throw new InvalidActivityException();
		}
		this.interest = interest;
	}

	public boolean isSimpleInterest() {
		return simpleInterest;
	}

	public void setSimpleInterest(boolean simpleInterest) {
		this.simpleInterest = simpleInterest;
	}

}
