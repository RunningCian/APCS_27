/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	

System.out.print("Please enter your name: ");
String name = sc.nextLine();
System.out.print("Please enter how many times you'd like to print your name: ");
int printc = sc.nextInt();
int printnum = 1;
while(printnum <= printc){
	System.out.println(name);
printnum = printnum +1;
}



		
	}
}
