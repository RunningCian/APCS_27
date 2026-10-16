/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int base, int exp){
		int total = base;
		while (exp > 1){
			total = total * base;
			exp = exp - 1;
		}
		return total;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		sc.nextLine();
		System.out.println("What is your exponent number?");
		int exp = sc.nextInt();
		System.out.print("Your answer is: " + pow(base, exp));


		
	}
}
