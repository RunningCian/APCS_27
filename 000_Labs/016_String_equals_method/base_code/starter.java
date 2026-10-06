/*
 *	Author:  Cian Byrne
 *  Date: 09/20/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?"); 
		String choice = sc.nextLine();
		System.out.print(" ");
		if (choice.equalsIgnoreCase("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
			if (!choice.equalsIgnoreCase("Wizard")){
			System.out.print("You've decided not to chose a role. Rerun program.");
		}
		}

			if (choice.equalsIgnoreCase("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
			if (!choice.equalsIgnoreCase("Warrior")){
			System.out.print("You've decided not to chose a role. Rerun program.");
		}
		}

			if (choice.equalsIgnoreCase("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
			if (!choice.equalsIgnoreCase("Rogue")){
			System.out.print("You've decided not to chose a role. Rerun program.");
		}
		}

		
	}
}
