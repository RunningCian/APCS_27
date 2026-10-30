/*
	Author: Cian Byrne
	Date: 10/27/26
	Collaborator(s): Grant tuggle
*/

import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
        Spiderman tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
        Spiderman andrew = new Spiderman("Andrew Garfield", 40, "Electro");
        Spiderman tom = new Spiderman("Tom Holland", 27, "The Vulture");
        Spiderman defaultSpider = new Spiderman(); 

        
        System.out.println("--- Tobey Maguire Spiderman ---");
        System.out.println("Actor: " + tobey.getActor());
        System.out.println("Age: " + tobey.getAge());
        System.out.println("Villain: " + tobey.getVillain());
        tobey.fight();
        tobey.printArt();
    }
}