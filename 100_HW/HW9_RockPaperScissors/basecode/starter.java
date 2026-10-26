/*
 *	Author: Cian Byrne
 *  Date: 10/25/26
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject() {
        int choice = (int)(Math.random()*3);
        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static int compare2(String p1, String p2) {
        if (p1.equalsIgnoreCase(p2)) {
            return 0;
        }
        
        if ((p1.equalsIgnoreCase("rock") && p2.equalsIgnoreCase("scissors")) || (p1.equalsIgnoreCase("paper") && p2.equalsIgnoreCase("rock")) || (p1.equalsIgnoreCase("scissors") && p2.equalsIgnoreCase("paper"))) {
            return 1;
        } else {
            return 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            boolean run = true;
            
        while (run) {
            System.out.println("Would you like to play the computer? (yes/no/done)");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("done")) {
                System.out.println("Thanks for playing!");
                run = false;
            } 
            else if (answer.equalsIgnoreCase("yes")) {
                boolean run1 = true;
                String playerC = " ";
                
                
                while (run1) {
                    System.out.println("Please enter rock/paper/scissors:");
                    playerC = sc.nextLine();
                    if (playerC.equalsIgnoreCase("rock") || playerC.equalsIgnoreCase("paper") || playerC.equalsIgnoreCase("scissors")) {
                        run1 = false;
                    }
                }

                String computer = getObject();
                int result = compare2(playerC, computer);

                if (result == 0) {
                    System.out.println("You tied!");
                } else if (result == 1) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost! :(");
                }
            } 
            else if (answer.equalsIgnoreCase("no")) {
                System.out.println("How many times would you like the computer to play itself?");
                int numGames = sc.nextInt();
                sc.nextLine();
                int p1W = 0;
                int p2W = 0;
                int ties = 0;
                int stop = 0;

                while (stop < numGames) {
                    String p1 = getObject();
                    String p2 = getObject();
                    int res = compare2(p1, p2);

                    if (res == 0) {
                        ties = ties + 1;
                    } else if (res == 1) {
                        p1W = p1W +1 ;
                    } else if (res == 2) {
                        p2W = p2W + 1;
                    }
                    stop = stop + 1;
                }

                System.out.println("Player 1 wins: " + p1W);
                System.out.println("Player 2 wins: " + p2W);
                System.out.println("Ties: " + ties);
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
