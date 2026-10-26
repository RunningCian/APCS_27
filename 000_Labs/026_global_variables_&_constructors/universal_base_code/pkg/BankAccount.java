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
	public static int nextacountnum = (int)(Math.random()*951)+ 50;

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

	public BankAccount(String owner, double balance){
		
		name = owner;
		acntnumber = nextacountnum;
		active = true;
		balance = this.balance;
		nextacountnum++;
	}

	// -------METHODS-------
}