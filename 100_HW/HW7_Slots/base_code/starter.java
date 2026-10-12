/*
 *	Author: Cian Byrne
 *  Date: 10/11/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		String answer = ("y");
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println(" ");
		while (money > 0){
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n") ){
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			}
			if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
				System.out.print("You have $" + money + ". How much would you like to wager? ");
                int wager = sc.nextInt();
                sc.nextLine();
				while ((wager > money) || (wager <= 0)) {
    			if ((wager > money)){
				System.out.print("You only have $" + money + "! Please enter a smaller number: ");
    			wager = sc.nextInt();
				sc.nextLine(); }
				
				else if (wager <= 0) {
    			System.out.print("You have $" + money + "! Please enter a positive number: ");
    			wager = sc.nextInt();
				sc.nextLine(); }
				}
				if (wager > 0 && wager <= money) {
                    int num1 = (int)(Math.random()*10) + 1;
                    int num2 = (int)(Math.random()*10) + 1;
                    int num3 = (int)(Math.random()*10) + 1;

                    System.out.println("Great! Let's play!!!");
                    System.out.println("Your rolls are:");
                    System.out.println("_______________________");
                    System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " |");
                    System.out.println("_______________________");
					if (num1 == num2 && num2 == num3) {
						money = money + (wager * 3);
						System.out.println("JACKPOT! You're wager has now been tripled");
					} else if ((num1 == num2 || num1 == num3 || num2 == num3)){
					money = money + (wager * 2);
                    System.out.println("You won! You're wager has now been doubled!");
						} else {
                        money = money - wager;
                        System.out.println("Didn't win this time, better luck next time!");
                    } System.out.println("You now have $" + money + ".");
					System.out.println();
					System.out.println("--------------------------------------------------");
					System.out.println();

				}
			}
			else {
    System.out.println("That wasn't quite the correct answer. Try again.");
	System.out.println("--------------------------------------------------");
}
		} if (money == 0) {
            System.out.println("You've run out of money! Thanks for coming! Come back soon!");
        } 
	}
}
