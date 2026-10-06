/*
 *	Author:  Cian Byrne
 *  Date: 10/02/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();



	
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?"); 
		String choice = sc.nextLine();
		System.out.print(" ");
		if (choice.equalsIgnoreCase("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
			System.out.println(" ");
			if (!choice.equalsIgnoreCase("Wizard")){
			System.out.print("You've decided not to chose a role. Rerun program.");
		}
		}

			if (choice.equalsIgnoreCase("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
			System.out.println(" ");
			if (!choice.equalsIgnoreCase("Warrior")){
			System.out.print("You've decided not to chose a role. Rerun program.");
		}
		}

			if (choice.equalsIgnoreCase("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			System.out.println(" ");
			if (!choice.equalsIgnoreCase("Rogue")){
			System.out.print("You've decided not to chose a role. Rerun program.");
		}
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
	System.out.println(" ");
		
		System.out.print("Strength (1-10):");
		int Strength = sc.nextInt();
		sc.nextLine();
		int points = 20;
	
	
	if (Strength > 10){ 
		System.out.print("Please input a smaller value. Strength (1-10): ");
		Strength = sc.nextInt();
	}
	if (Strength > points){ 
		System.out.print("Please input a smaller value. Strength (1-10): ");
		Strength = sc.nextInt();
	}
	points = points - Strength;
	System.out.println("You have " + (points) + " left to spend.");
System.out.println(" ");





		System.out.print("Dexterity (1-10):");
		int Dexterity = sc.nextInt();
		sc.nextLine();
		
	
	
	if (Dexterity > 10){ 
		System.out.print("Please input a smaller value. Dexterity (1-10): ");
		Dexterity = sc.nextInt();
	}
	if (Dexterity > points){ 
		System.out.print("Please input a smaller value. Dexterity (1-10): ");
		Dexterity = sc.nextInt();
	}
	points = points - Dexterity;
	System.out.println("You have " + (points) + " left to spend.");
System.out.println(" ");





		System.out.print("Intelligence (1-10):");
		int Intelligence = sc.nextInt();
		sc.nextLine();
		
	
	
	if (Intelligence > 10){ 
		System.out.print("Please input a smaller value. Intelligence (1-10): ");
		 Intelligence = sc.nextInt();
	}
	if (Intelligence > points){ 
		System.out.print("Please input a smaller value. Intelligence (1-10): ");
		 Intelligence = sc.nextInt();
	}
points = points - Intelligence;
	System.out.println("You have " + (points) + " left to spend.");
System.out.println(" ");





		System.out.print("Charisma (1-10):");
		int Charisma = sc.nextInt();
		sc.nextLine();
		
	
	
	if (Charisma > 10){ 
		System.out.print("Please input a smaller value. Charisma (1-10): ");
	 Charisma = sc.nextInt();
	}
	if (Charisma > points){ 
		System.out.print("Please input a smaller value. Charisma (1-10): ");
		 Charisma = sc.nextInt();
	}
	points = points - Charisma;
	System.out.println("You have " + (points) + " left to spend.");
	System.out.println(" ");


	
		System.out.println("You have " + (((((20)-Dexterity)-Intelligence)-Strength)-Charisma) + " to spend for next time.");
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + choice + " with the following stats!");
		System.out.println("Strength - " + Strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + Intelligence);
		System.out.println("Charisma - " + Charisma);
		System.out.println(" ");
		System.out.println("Good luck on your quest " + name + "!");
	}
}
