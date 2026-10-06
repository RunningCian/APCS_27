/*
 *	Author: Cian Byrne
 *  Date: 10/04/26
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== AIRPORT FLIGHT PLANNER ===");
        
        System.out.print("Departure hour (0-23): ");
        int departureh = sc.nextInt();
        System.out.print("Departure minute (0-59): ");
        int departurem = sc.nextInt();

        System.out.print("Airport arrival hour (0-23): ");
        int arrivalh = sc.nextInt();
        System.out.print("Airport arrival minute (0-59): ");
        int arrivalm = sc.nextInt();
        sc.nextLine();

         int boardingt = 15;


        System.out.print("Are you chacking a bag? (yes or no): ");
        String bag = sc.nextLine();
        System.out.print("Is your flight international? (yes or no): ");
        String international = sc.nextLine();
        int departureto = departureh * 60 + departurem;
        int arrivalto = arrivalh * 60 + arrivalm;
        int availablet = departureto - arrivalto;


        int security = ((int)(Math.random() * 3)) + 1;
        int securityt;
        if (security == 1) {
            securityt = 15;
        } 
        else if (security == 2) {
            securityt = 30;
        } 
        else {
            securityt = 45;
        }

       

        int bagt = 0;
        int internationalt = 0;
        if (bag.equalsIgnoreCase("yes")) {
            bagt = 20;
        }
        if (international.equalsIgnoreCase("yes")) {
            internationalt = 30;
        }
        int totalt = securityt + bagt + internationalt + boardingt;
        int extrat = availablet - totalt;






System.out.println();
System.out.println("=== FLIGHT ANALYSIS ===");
System.out.println("Flight departure time: " + departureh + " hours and, " + departurem + " and minutes");
System.out.println("Your airport arrival time: " + arrivalh + " hours and, " + arrivalm + " and minutes");
System.out.println("Security level: " + security);
System.out.println("Security wait: " + securityt + " minutes!!!!!");
System.out.println("Bag check time: " + bagt + " minutes!!!!!!");
System.out.println("International extra time: " + internationalt + " minutes");
System.out.println("Total time needed: " + totalt + " minutes");
System.out.println("Boarding time: " + boardingt + " minutes");
System.out.println("Time available: " + availablet + " minutes");
System.out.println();
    if (extrat >= 60) {
    int extrah = extrat / 60;
    int extramin = extrat % 60;
    System.out.println("YOU'LL MAKE YOUR FLIGHT!");
    System.out.println("You have " + extrah + " hours and " + extramin + " minutes of extra time to explore the airport.");
        } 
        else if (extrat >= 0) {
        System.out.println("YOU'LL MAKE YOUR FLIGHT!");
        System.out.println("You have " + extrat + " minutes of extra time before boarding.");
} 
        else {
        int missed = Math.abs(extrat);
        int missedh = missed / 60;
        int missedmin = missed % 60;
        System.out.println("YOU MISSED YOUR FLIGHT!");
        System.out.println("You needed " + missedh + " hours and " + missedmin + " more minutes.");
        }

       
    }
}
