/*
 *	Author:  Cian Byrne
 *  Date: 10/9/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
int random = (int)(Math.random()*1000)+1;
System.out.println("Welcome to the guessing game!");
int guess = -1;
while (guess != random){
	System.out.println("Please guess a number:");
	guess = sc.nextInt();
	if(guess<random){
		System.out.println("The number is higher.");
	}
	else if(guess>random){
		System.out.println("The number is lower.");
	}	
	else{
		System.out.println("You got the number!");
		
	}
}


		
	}
}
