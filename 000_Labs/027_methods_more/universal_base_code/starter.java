/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Byrne ATM!");
        System.out.println("We're going to create a bank account! What info do we know?");
        System.out.println("1 - Nothing");
        System.out.println("2 - Owner");
        System.out.println("3 - Owner and Initial Deposit");
        
        int choice = sc.nextInt();
        sc.nextLine();
        
        if (choice == 1) {
            BankAccount myAccount = new BankAccount();
			System.out.println("");
            System.out.println("Account successfully created!");
            

            System.out.println();
            myAccount.displayAccountInfo();
            System.out.println("");
            System.out.println("Would you like to check your balance of this account? (yes/no)");
            String ans = sc.nextLine();
            
            if (ans.equalsIgnoreCase("yes")) {
                myAccount.checksBalance();
            } else {
                System.out.println("Great! No balance checked.");
            }
            System.out.println("");
            System.out.println("Thank you for coming to the Byrne ATM!");
        } 





        else if (choice == 2) {
			System.out.println("");
            System.out.println("What is the name of the owner of this bank account?");
            String name = sc.nextLine();
            BankAccount myAccount = new BankAccount(name);
            
            System.out.println("");
            myAccount.displayAccountInfo();
            System.out.println("");
            System.out.println("Would you like to check your balance of this account? (yes/no)");
            String ans = sc.nextLine();
            
            if (ans.equalsIgnoreCase("yes")) {
                myAccount.checksBalance();
            } else {
                System.out.println("Great! No balance checked.");
            }
            System.out.println("");
            System.out.println("Thank you for coming to the Byrne ATM!");
        } 





        else if (choice == 3) {
			System.out.println("");
            System.out.println("What is the name of the owner of this bank account?");
            String name = sc.nextLine();
            System.out.println("How much are you initally depositing into this account?");
            double deposit = sc.nextDouble();
        sc.nextLine(); 
            BankAccount myAccount = new BankAccount(name, deposit);
            
            System.out.println();
            myAccount.displayAccountInfo();
            System.out.println("");
            System.out.println("Would you like to check your balance of this account? (yes/no)");
            String ans = sc.nextLine();
            
            if (ans.equalsIgnoreCase("yes")) {
                myAccount.checksBalance();
            } else {
                System.out.println("Great! No balance checked.");
            }
            System.out.println("");
            System.out.println("Thank you for coming to the Byrne ATM!");
        } 


		
        else {
			System.out.println("");
            System.out.println("Account unsuccessfuly created!");
        }
        
        
    }
}