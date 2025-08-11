package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities1;

public class Program9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int c = sc.nextInt();
		
		Entities1[] vet = new Entities1[c];
		
		int maisVelhoI = 0;
		String maisVelhoN = "teste";
		
		for (int i = 1; i <= vet.length; i++) {
			sc.nextLine();
			System.out.println("dados da " + i + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vet[i - 1] = new Entities1(nome, idade);
			if (idade > maisVelhoI) {
				maisVelhoI = idade;
				maisVelhoN = nome;
			}
			
		}
		System.out.println("PESSOA MAIS VELHA: " + maisVelhoN);
		
		sc.close();

	}

}
