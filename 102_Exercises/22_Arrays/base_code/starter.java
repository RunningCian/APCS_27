/*
 *	Author: Cian byrne
 *  Date: 11/09/26
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int []arr = new int [1001];
		 int index1 = 0;
		 int value1 = 3;
		 while (index1 < 1001){
			arr[index1] = value1;
			System.out.print(arr[index1] + ", ");
			value1 = value1 + 3;
			index1++;
		 }
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");

		 int []arr2 = new int [1001];
		 int index2 = 0;
		 int value2 = 1000;
		 while (index2 < 1001){
			arr2[index2] = value2;
			System.out.print(arr2[index2] + ", ");
			value2--;
			index2++;
		 }
	}
}
