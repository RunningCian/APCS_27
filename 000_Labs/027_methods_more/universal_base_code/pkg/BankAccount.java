/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private int acntnumber;
	private String name;
	private boolean active;
	private double balance;
	private static int nextacountnum = (int)(Math.random()*951)+ 50;

	// -------CONSTRUCTORS-------
	public BankAccount(){
		name = "unknown";
		acntnumber = nextacountnum;
		active = true;
		balance = 0.0;
		nextacountnum++;
	}

	public BankAccount(String owner){
		
		name = owner;
		acntnumber = nextacountnum;
		active = true;
		balance = 0.0;
		nextacountnum++;
	}

	public BankAccount(String owner, double startingbalance){
		
		name = owner;
		acntnumber = nextacountnum;
		active = true;
		balance = startingbalance;
		nextacountnum++;
	}

	// -------METHODS-------
	public void checksBalance(){
		System.out.print("Your balance is: " + balance);

	}

	public void displayAccountInfo(){
		System.out.println("Account Name: " + name);
        System.out.println("Account Number: " + acntnumber);
        System.out.println("Active Status: " + active);
        System.out.println("Balance: " + balance);
        System.out.println("--------------------------");

	}}