/*
 *	Author:  Cian Byrne
 *  Date: 11/13/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int s = (int)(Math.random()*150)+51;
        int[] arr = new int[s];
        

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100)+1;
        }

		
        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
           
		    if (arr[i] < min) {
                min = arr[i];
            }
            
			if (arr[i] > max) {
                max = arr[i];
            }
           
			sum=sum + arr[i];
        }

        
        double avg = (double)(sum/arr.length);
		System.out.println("elements: " + arr.length);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);
		
		
		BaseClass test = new BaseClass();
	}
}
