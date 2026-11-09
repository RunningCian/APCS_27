/*
 *	Author: Cian Byrne
 *  Date: 11/8/26
*/

import java.util.Scanner;

public class starter {

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
		

        int check = 2;
        while (check < num) {
            if (num % check == 0) {
                return false;
            }


            check = check + 1;
        }

		return true;
		}

    
	
	
	public static void printPrimes(int maxnum) {
        
		int current = 2;
       
	    while (current < maxnum) {
            if (checkPrime(current)) {
                System.out.println(current);
            }
           
		    current = current + 1;
        }}

    
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a number and we'll print out every prime until that number: ");
        int inputn = sc.nextInt();
        
        printPrimes(inputn);
    }
}