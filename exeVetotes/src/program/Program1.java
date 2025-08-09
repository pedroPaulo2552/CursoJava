package program;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos número você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				System.out.printf("%.0f%n", vet[i]);
			}
		}
		
		
		sc.close();
	}

}
