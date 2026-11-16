/*
 *	Author:  Cian Byrne
 *  Date: 11/13/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

int[] arr = new int[1000];
    
	
	    int i = 0;
        while (i < arr.length) {
            arr[i] = (int)(Math.random() * 100)+1;
            i++; }
       

        int a= 0;
        while (a < arr.length) {
            System.out.println(arr[a]);
            a++;
		}


		BaseClass test = new BaseClass();
	}
}
