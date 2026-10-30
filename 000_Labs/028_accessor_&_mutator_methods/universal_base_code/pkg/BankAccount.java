/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner;
    private double balance;
	private boolean isActive;
	
	// -------CONSTRUCTORS-------
    public BankAccount() {
        owner = "Unknown";
        balance = 0.0;
		isActive = true;
    }

    public BankAccount(String newOwner) {
        owner = newOwner;
        balance = 0.0;
		isActive = true;
    }

    public BankAccount(String newOwner, double startingBalance) {
        owner = newOwner;
        balance = startingBalance;
		isActive = true;
    }

	public BankAccount(String newOwner, double startingBalance, boolean newisActive) {
        owner = newOwner;
        balance = startingBalance;
		isActive = newisActive;
    }

	// -------METHODS-------
    public String getOwner() {
        return owner;
    }
    public void setOwner(String newOwner) {
        owner = newOwner;
    }
    public double getBalance() {
        return balance;
    }
    public void closeAccount() {
        isActive = false;
        balance = 0.0;
        System.out.println("Account has been closed.");
    }
    public boolean isActive() {
        return isActive;
    }
    public void deposit(double amount) {
        if (isActive && amount > 0) {
            balance = (balance + amount);
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit failed: Account must be active and amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (isActive && amount > 0 && balance >= amount) {
            balance = (balance - amount);
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Withdrawal failed: Account must be active with sufficient funds.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Owner: " + owner);
        System.out.println("Account Balance: $" + balance);
        System.out.println("Account Active: " + isActive);
    }

    public void checkBalance() {
        System.out.println("Current balance for " + owner + ": $" + balance);
    }
}