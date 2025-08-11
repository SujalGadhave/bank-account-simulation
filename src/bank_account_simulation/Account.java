package bank_account_simulation;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNumber;
	protected double accountBalance;
	private List<String> transactionHistory;
	
	public Account(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = initialBalance;
		this.transactionHistory = new ArrayList<>();
		transactionHistory.add("Account created with balance: " + initialBalance);
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			accountBalance += amount;
			transactionHistory.add("Deposited: " + amount + " | New balance: " + accountBalance);
			
		} else {
			transactionHistory.add("Failed deposit attempt: " + amount);
			System.out.println("Deposit amount must be positive.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= accountBalance) {
			accountBalance -= amount;
			transactionHistory.add("Withdrew: " + amount + " | New Balance: " + accountBalance);
		}else {
			transactionHistory.add("Failed withdrawal attempt: " + amount);
			System.out.println("Insufficient funds or invalid amount.");
		}
	}
	
	public double getBalance() {
		return accountBalance;
	}
	
	public void printTransactionHistory() {
		System.out.println("Transaction History: " + accountNumber);
		for(String transaction : transactionHistory) {
			System.out.println(transaction);
		}
	}
}
