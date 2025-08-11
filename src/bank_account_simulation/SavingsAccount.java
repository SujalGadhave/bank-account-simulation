package bank_account_simulation;

public class SavingsAccount extends Account {
	private double interestRate;

	public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
		super(accountNumber, initialBalance);
		this.interestRate = interestRate;
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount < 500) {
			System.out.println("Can't withdraw. Minimum balance of 500 must be maintained.");
		} else {
			super.withdraw(amount);
		}
	}

	public void addInterest() {
		double interest = getBalance() * (interestRate / 100);
		deposit(interest);

		System.out.println("Interest added: " + interest);
	}

}
