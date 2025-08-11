package program;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int c = sc.nextInt();
		
		int[] vet = new int[c];
		
		int totPar = 0;
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				totPar++;
			}
		}
		System.out.println();
		
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + "  ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + totPar);
		sc.close();

	}

}
