/*
 *	Author: Cian Byrne
 *  Date: 11/1/26
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dog name?");
        String dogname = sc.nextLine();

        Dog dog1 = new Dog(dogname);

        System.out.println("What age should " + dogname + " be?");
        int dogage = sc.nextInt();

        dog1.setAge(dogage);

      




        Dog dog2 = new Dog("Toto", "Cairn Terrier");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed()
                + " that is " + dog1.getAge() + " years old!");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed()
                + " that is " + dog2.getAge() + " years old!");

        boolean dog1Sleeping = dog1.isSleeping();
        if (dog1Sleeping) {
            System.out.println(dog1.getName() + " is asleep!");
        } else {
            System.out.println(dog1.getName() + " is awake!");
            dog1.bark();
        }

        


        boolean dog2Sleeping = dog2.isSleeping();
        if (dog2Sleeping) {
            if (!dog1Sleeping) {
                System.out.println(dog2.getName() +
                        " wakes up from hearing " + dog1.getName());
                dog2.bark();
            }
        } else {
            if (!dog1Sleeping) {
                dog2.bark();
            }
        }
    }
}