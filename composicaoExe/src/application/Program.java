package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departmente;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
		
		
		System.out.print("Enter department's name: ");
		String departamento = sc.nextLine();
		Departmente depart = new Departmente(departamento);
		
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		WorkerLevel level1 = WorkerLevel.valueOf(level);
		System.out.print("Base salary: ");
		Double salary = sc.nextDouble();
		Worker worker1 = new Worker(name, level1 , salary);
		
		System.out.print("How many contracts to this worker? ");
		int Quantcontracts = sc.nextInt(); 
		
		for (int c = 0; c < Quantcontracts; c++) {
			sc.nextLine();
			System.out.println("Enter contract #" + (c + 1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			String dateString = sc.nextLine();
			LocalDate date = LocalDate.parse(dateString, fmt1);
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (Hours): ");
			Integer hours = sc.nextInt();
			HourContract contract = new HourContract(date, valuePerHour, hours);
			worker1.addContract(contract);
		}
		sc.nextLine();
		System.out.println();
		char res2 = 's';
		do {
			System.out.println("[1] To calculate income");
			System.out.println("[2] To remove contract");
			int res1 = sc.nextInt();
			switch (res1) {
			case 1:
				sc.nextLine();
				System.out.print("Enter month and year to calculate income (MM/YYYY): ");
				String mesAnoString = sc.nextLine();
				int ano = Integer.parseInt(mesAnoString.substring(3, 7));
				int mes = Integer.parseInt(mesAnoString.substring(0, 2));
				
				System.out.println("Name: " + worker1.getName());
				System.out.println("Department: " + depart.getName());
				System.out.println("Income for " + mesAnoString + ": " + String.format("%.2f", worker1.income(ano, mes)));
				break;
				
			case 2:
				sc.nextLine();
				System.out.print("Date of contract (DD/MM/YYYY): ");
				String dateString = sc.nextLine();
				LocalDate date = LocalDate.parse(dateString, fmt1);
				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.print("Duration (Hours): ");
				Integer hours = sc.nextInt();
				HourContract contract = new HourContract(date, valuePerHour, hours);
				worker1.removeContract(contract);
				break;
			}
			
			System.out.print("Do you want to continue (s/n)? ");
			res2 = sc.next().charAt(0);
		} while (res2 == 's');
		
		System.out.println("=========================================================");
		System.out.println("                   COMEBACK ANYTIME                      ");
		System.out.println("=========================================================");
		
		sc.close();

	}

}
