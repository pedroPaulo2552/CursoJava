package Exercicios;

import java.util.Locale;

public class ex01 {

	public static void main(String[] args) {
			String product1 = "Computer";
			String product2 = "Office Desk";
			double price1 = 2100.0;
			double price2 = 650.50;
			System.out.println("Products:");
			System.out.printf("%s, which price is $ %.2f%n", product1, price1);
			System.out.printf("%s, which price is $ %.2f%n", product2, price2);
			System.out.println();
			
			int age = 30;
			int code = 5290;
			char gender = 'F';
			System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
			System.out.println();
			
			double measure = 53.234567;
			System.out.printf("Measue with eight decimal places: %.8f%n", measure);		
			System.out.printf("Rounded (three decimal places): %.3f%n", measure);	
			Locale.setDefault(Locale.US);
			System.out.printf("US decimal point: %.3f%n", measure);

	}

}
