package program;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

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
		
		double soma = 0;
		System.out.print("VALORES = ");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + "  ");
			soma += vet[i];
		}
		System.out.println();
		
		double media = soma / vet.length;
		System.out.printf("SOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}

}
