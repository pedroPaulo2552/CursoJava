package program;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int c = sc.nextInt();
		
		double[] vet = new double[c];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		double maiorVal = 0;
		int posicaoMaiorVal = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maiorVal) {
				maiorVal = vet[i];
				posicaoMaiorVal = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + maiorVal);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaiorVal);

	}

}
