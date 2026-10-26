/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();

		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		Dwight.raiseSalary(20);
		System.out.println("Monthly salary: " + Dwight.getSalary());
		System.out.println("Yearly salary: " + Dwight.getAnnualSalary());


		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		Jim.raiseSalary(5);
		System.out.println("Monthly salary: " + Jim.getSalary());
		System.out.println("Yearly salary: " + Jim.getAnnualSalary());

		Employee Pam = new Employee(2011, "Pam",  "Beesly", 2250);
		Pam.employeeToString();
		Pam.raiseSalary(50);
		System.out.println("Monthly salary: " + Pam.getSalary());
		System.out.println("Yearly salary: " + Pam.getAnnualSalary());

		Employee Grant = new Employee(2012, "Grant", "tuggle", 50);
		Grant.employeeToString();
		Grant.raiseSalary(-500000);
		System.out.println("Monthly salary: " + Grant.getSalary());
		System.out.println("Yearly salary: " + Grant.getAnnualSalary());

		
	}
}
