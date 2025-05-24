package Aula7;

import java.util.Locale;
import java.util.Scanner;

public class facaEnquanto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char res;
		double temp;
		do {
			System.out.print("Digite a temperatura em Celsius:");
			temp = sc.nextDouble();
			double fah = (9 * temp) / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fah);
			System.out.print("Deseja repetir (s/n)?");
			res = sc.next().charAt(0);
		} while (res == 's');
		
		sc.close();

	}

}
