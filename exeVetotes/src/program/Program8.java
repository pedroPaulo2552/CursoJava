package program;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int c = sc.nextInt();
		
		int[] vet = new int[c];
		
		int totpar = 0;
		int par = 0;
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				par++;
				totpar += vet[i]; 
			}
		}
		
		if(par > 0) {
			double media = totpar / par;
			System.out.printf("MEDIA DOS PARES = %.2f%n", media);
		} else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		
		sc.close();

	}

}
