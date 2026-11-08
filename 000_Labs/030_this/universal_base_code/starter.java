/*
 *	Author:  Cian Byrne
 *  Date: 10/30/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
        String firstName = randName();
        int firstAge = (int)(Math.random() * 50) + 1;
        PooleDwarf dwarf1 = new PooleDwarf(firstName, firstAge);

        int duplicates = 0;
        int count = 1; 

        while (count < 7) {
            String otherName = randName();
            int otherAge = (int)(Math.random() * 50) + 1;
            PooleDwarf currentDwarf = new PooleDwarf(otherName, otherAge);
            

            if (currentDwarf.isSameName(firstName)) {
                duplicates = duplicates + 1;
            }
            
            count = count + 1;
        }
        System.out.println("Dwarf Name: " + firstName);
        System.out.println("Duplicates: " + duplicates);
		
	}
}
