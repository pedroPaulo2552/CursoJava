package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTIDADE DE PRODUTOS: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Products[] vet = new Products[n];
		
		double soma = 0;
		for (int i = 0; i < vet.length; i++) {
			vet[i] = new Products();
			System.out.print("NOME DO PRODUTO: ");
			vet[i].name = sc.nextLine();
			System.out.print("PREÇO DO PRODUTO: ");
			vet[i].price = sc.nextDouble();
			sc.nextLine();
			soma += vet[i].price;
		}
		
		double media = soma / vet.length;
		System.out.printf("MEDIA DOS PRÇOS: %.2f%n", media);
		
		sc.close();
	}

}
