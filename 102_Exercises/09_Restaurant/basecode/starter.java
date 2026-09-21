/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println(".	WELCOME RESTAURANT OWNER!			.");
		System.out.println("=================================================");
		System.out.println(" ");
		System.out.print("What's the name of your restaurant? ");
		String Restaurantname = sc.nextLine();
		System.out.println(" ");
		System.out.print("What's your name? ");
		String name = sc.nextLine();
		System.out.println("Great to see you, "+ name +"! " + "Let's set up a menu for " + Restaurantname + "!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println(" ");
		
		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");
		String item1name = sc.nextLine();
		System.out.print("Price of " + item1name + "($): ");
		int item1price = sc.nextInt();
		sc.nextLine();
		System.out.print("How many " + item1name + " would you like? ");
		int item1q = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + item1q + "x " + item1name+ " to your order!" + "($" + (item1price)*(item1q) + ")");
		
		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");
		String item2name = sc.nextLine();
		System.out.print("Price of " + item2name + "($): ");
		int item2price = sc.nextInt();
		sc.nextLine();
		System.out.print("How many " + item2name + " would you like? ");
		int item2q = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + item2q + "x " + item1name+ " to your order!" + "($" + (item2price)*(item2q) + ")");

		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String item3name = sc.nextLine();
		System.out.print("Price of " + item3name + "($): ");
		int item3price = sc.nextInt();
		sc.nextLine();
		System.out.print("How many " + item3name + " would you like? ");
		int item3q = sc.nextInt();
		sc.nextLine();
		System.out.println("Added " + item3q + "x " + item3name+ " to your order!" + "($" + (item3price)*(item3q) + ")");

		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		int tipp = sc.nextInt();
		sc.nextLine();
		System.out.println("=================================================");
		System.out.println(		Restaurantname + " - Menu For Today"		);
		System.out.println("=================================================");
		System.out.println("Owner: " + name);
		System.out.println("-------------------------------------------------");
		System.out.println("Item			Qty 			Price");
		System.out.println("-------------------------------------------------");
		System.out.println(item1name + "			" + item1q + "			" + item1price*item1q);
		System.out.println(item2name + "			" + item2q + "			" + item2price*item2q);
		System.out.println(item3name + "			" + item3q + "			" + item3price*item3q);
		System.out.println("-------------------------------------------------");
		int subtotal = ((item1price*item1q)+(item2price*item2q)+(item3price*item3q));
		System.out.println("Subtotal:					" + subtotal);
		Double tax = ((Double)(0.0975*subtotal));
		System.out.println("Tax (9.75%):			" + (tax));	
		Double tip = ((double)tipp/100);
		Double tipcalc = ((tip*subtotal));
		System.out.println("Tip:					" + (tipp));
		System.out.println("Tip Amount:					" + (tipcalc));	
		double total = (subtotal+tax+tipcalc);
		System.out.println("=================================================");	
		System.out.println("TOTAL: 					$" + (total));
		System.out.println("=================================================");
		System.out.println("Thanks for eating at " + (Restaurantname) + "!");
		System.out.println("Come back soon -- we'll always have a byte for you!");			
	}
}
