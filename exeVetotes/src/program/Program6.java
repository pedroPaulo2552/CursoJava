package program;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int c = sc.nextInt();
		
		int[] vetA = new int[c];
		int[] vetB = new int[c];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 1; i <= vetA.length; i++) {
			System.out.print(i + "o valor: ");
			vetA[i - 1] = sc.nextInt();
		}
		
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 1; i <= vetB.length; i++) {
			System.out.print(i + "o valor: ");
			vetB[i - 1] = sc.nextInt();
		}
		
		int[] vetC = new int[c];
		
		System.out.println("VETOR RESULTANTE");
		for (int i = 0; i < vetC.length; i++) {
			vetC[i] = vetA[i] + vetB[i];
			System.out.println(vetC[i]);
		}
		
		sc.close();
	}

}
