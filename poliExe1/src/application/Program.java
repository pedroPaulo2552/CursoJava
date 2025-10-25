package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		Employee[] employees = new Employee[n];
		
		for (int i = 0; i < employees.length; i++) {
			sc.nextLine();
			System.out.println("Employee #" + (i+1) + " data");
			System.out.print("Outsourced (y/n)? ");
			char r = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (r == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employees[i] = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				System.out.println(employees[i].payment());
			} else {
				employees[i] = new Employee(name, hours, valuePerHour);
			}
			
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee c : employees) {
			System.out.println(c);
		}
		
		
		
		
		
		sc.close();

	}

}
