package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("NUMERO DE PESSOAS: ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0;
		for(int i = 0; i < n; i++) {
			System.out.print("ALTURA DA PESSOA " + i + ": ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		double media = soma / n;
		System.out.printf("AVERAGE HEIGHT = %.2f", media);
		
		sc.close();

	}

}
