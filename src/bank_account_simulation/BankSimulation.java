package bank_account_simulation;

public class BankSimulation {
	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount("1234567890", 10000, 7.0);
		
		account.deposit(5000);
		account.withdraw(2500);
		account.addInterest();
		
		account.printTransactionHistory();
	}
}
