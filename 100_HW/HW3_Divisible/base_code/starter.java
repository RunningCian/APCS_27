/*
 *	Author: Cian Byrne
 *  Date: 09/27/26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int num2 = sc.nextInt();
		System.out.println(" ");
		int num1calc1 = num1%2;
		int num1calc3 = num1%3;
		int num1calc4 = num1%4;
		int num1calc5 = num1%5;

		int num2calc1 = num2%2;
		int num2calc3 = num2%3;
		int num2calc4 = num2%4;
		int num2calc5 = num2%5;
		
		
		
		if (num1calc3 == 0){
			System.out.println(num1 + " is divisible by 3!");
		
		}
		if (num1calc3 > 0){
		System.out.println(num1 + " is not divisible by 3!");
		
		}
		if (num1calc4 == 0){
			System.out.println(num1 + " is divisible by 4!");
		
		}
		if (num1calc4 > 0){
		System.out.println(num1 + " is not divisible by 4!");
		
		}if (num1calc5 == 0){
			System.out.println(num1 + " is divisible by 5!");
		
		}
		if (num1calc5 > 0){
		System.out.println(num1 + " is not divisible by 5!");
		
		}


			if (num1calc1 == 0){
			System.out.println(num1 + " is Even!!");
		}
		
		if (num1calc1 > 0){
		System.out.println(num1 + " is Odd!!");	
		}
			System.out.println(" ");
		
	
	
	
		
		if (num2calc3 == 0){
			System.out.println(num2 + " is divisible by 3!");
		
		}
		if (num2calc3 > 0){
		System.out.println(num2 + " is not divisible by 3!");
		
		}
		if (num2calc4 == 0){
			System.out.println(num2 + " is divisible by 4!");
		
		}
		if (num2calc4 > 0){
		System.out.println(num2 + " is not divisible by 4!");
		
		}if (num2calc5 == 0){
			System.out.println(num2 + " is divisible by 5!");
		
		}
		if (num2calc5 > 0){
		System.out.println(num2 + " is not divisible by 5!");
		
		}


			if (num2calc1 == 0){
			System.out.println(num2 + " is Even!!");
		}
		
		if (num2calc1 > 0){
		System.out.println(num2 + " is Odd!!");	
		}
			System.out.println(" ");
		
	}
}
