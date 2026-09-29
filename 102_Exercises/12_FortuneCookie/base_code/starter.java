/*
 *	Author: Cian Byrne
 *  Date: 09/22/26
 *	Collaborator(s): 
*/
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	int number = (int)(Math.random()*(10-1))+1;
	System.out.println("Your fortune is: ");

	if(number ==1.0){
		System.out.println("Make it happen or else");
	}
	if(number ==2.0){
		System.out.println("You no longer speak english you now speak chinese: 你好，你叫什么名字？");
	}
	if(number ==3.0){
		System.out.println("Its your unlucky day you dont get a fortune");
	}
	if(number ==4.0){
		System.out.println("Upon reading this message you are now Sammy Durbas");
	}
	if(number ==5.0){
		int num1 = (int)(Math.random()*(10-1))+1;
		int num2 = (int)(Math.random()*(10-1))+1;
		int num3 = (int)(Math.random()*(10-1))+1;
		int num4 = (int)(Math.random()*(10-1))+1;
		int num5 = (int)(Math.random()*(10-1))+1;
		int num6 = (int)(Math.random()*(10-1))+1;
		int num7 = (int)(Math.random()*(10-1))+1;
		int num8 = (int)(Math.random()*(10-1))+1;
		int num9 = (int)(Math.random()*(10-1))+1;
		int num10 = (int)(Math.random()*(10-1))+1;
		System.out.println("Your lucky number is : " + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num9 +num10);
	}
	if(number ==6.0){
		System.out.println("I see your future. It is not yours, though");
	}
	if(number ==7.0){
		System.out.println("Seek help from professionals trained in mental health care");
	}
	if(number ==8.0){
		System.out.println("If you are a Boy put 1 and 2 if you are a Girl");
		int gender = sc.nextInt();
		if(gender == 1){
			System.out.println("Mr. Poole say you are a bad Boy");
		}
		if(gender == 2){
			System.out.println("Mr. Poole say you are a bad Girl");
		}
if(gender > 2 ){
			System.out.println("Follow directions");
		}
	}
	if(number ==9.0){
		System.out.println("You are going to get robbed by a jack o'lantern in your sleep");
	}
	if(number ==10.0){
		System.out.println("You are the light at the end of the tunnel");
	}
	
		
	}
}
