/*
 *	Author:  Cian Byrne
 *  Date: 	09/24/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int mainnum = (int)(Math.random()*(1000-1))+1;
		int num = sc.nextInt();
		if (num == mainnum) {
			System.out.print("You guessed the random number!! Good Job!");
		}
	if (num != mainnum){
		System.out.println("Your number wasn't the random number. The number was " + mainnum);
	if (num > 1000){
System.out.println("Learn to follow directions");
	}
	}

	}
}
