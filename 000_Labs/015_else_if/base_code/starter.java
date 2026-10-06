/*
 *	Author:  Cian Byrne
 *  Date: 09/29/30
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
		if (num < mainnum){
			System.out.println("Your number was smaller than the number. The number was " + mainnum);
		}
		if (num > mainnum){
			System.out.println("Your number was larger than the number. The number was " + mainnum);
		}
	if (num > 1000){
System.out.println("Learn to follow directions");
	} }
	
	}
	}

