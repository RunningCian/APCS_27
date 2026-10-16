/*
 *	Author:  Cian Byrne
 *  Date: 10/14/26
*/

import java.util.Scanner;

class starter {
	public static void tostring(String sent1){
		System.out.println(sent1);
		return;


	}

	public static void toStringCombined(String sent1, String sent2){
		System.out.print(sent1 + sent2);
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String sent1 = sc.nextLine();
		System.out.println("Write a sentence!");
		String sent2 = sc.nextLine();
		System.out.println(" ");
		System.out.println("This is using the methods!");
		tostring(sent1);
		toStringCombined(sent1, sent2);



		
	}
}
