/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("The goal of the game is to guess a word with two hints!");
	int ran = ((int)(Math.random() * 3)) + 1;
	
	
	if (ran == 1){
	
	String Ans = "Cake";
	System.out.println("It's a sweet food!");
	System.out.print("What is your guess? ");
	String guess1 = sc.nextLine();
	System.out.print(" ");
	if (Ans.equalsIgnoreCase(guess1)){
		System.out.print("You got it! Woo!");
	}

	if (!Ans.equalsIgnoreCase(guess1)){
		System.out.println("You sadly didn't guess right, here's another hint!");
		System.out.println("You might eat it on your birthday!");
		String guess2 = sc.nextLine();
		
		if (Ans.equalsIgnoreCase(guess2)){
			System.out.print("You got it! Woo!");	
		}

		if (!Ans.equalsIgnoreCase(guess2)){
			System.out.println("The answer was "+ Ans +", better luck next time!");
		}
	} }






if (ran == 2){
	
	String Ans1 = "Sailboat";
	System.out.println("It can travel on water.(Vehicle)");
	System.out.print("What is your guess? ");
	String guess1t2 = sc.nextLine();
	System.out.print(" ");
	if (Ans1.equalsIgnoreCase(guess1t2)){
		System.out.print("You got it! Woo!");
	}

	if (!Ans1.equalsIgnoreCase(guess1t2)){
		System.out.println("You sadly didn't guess right, here's another hint!");
		System.out.println("It has sails!");
		String guess2t2 = sc.nextLine();
		
		if (Ans1.equalsIgnoreCase(guess2t2)){
			System.out.print("You got it! Woo!");	
		}

		if (!Ans1.equalsIgnoreCase(guess2t2)){
			System.out.println("The answer was "+ Ans1 +", better luck next time!");
		}
	} }







	if (ran == 3){
	
	String Ans2 = "cactus";
	System.out.println("It can be found in the desert!(Plant)");
	System.out.print("What is your guess? ");
	String guess1t3 = sc.nextLine();
	System.out.print(" ");
	if (Ans2.equalsIgnoreCase(guess1t3)){
		System.out.print("You got it! Woo!");
	}

	if (!Ans2.equalsIgnoreCase(guess1t3)){
		System.out.println("You sadly didn't guess right, here's another hint!");
		System.out.println("It stores water inside");
		String guess2t3 = sc.nextLine();
		
		if (Ans2.equalsIgnoreCase(guess2t3)){
			System.out.print("You got it! Woo!");	
		}

		if (!Ans2.equalsIgnoreCase(guess2t3)){
			System.out.println("The answer was "+ Ans2 +", better luck next time!");
		}
	} }
	}
}
