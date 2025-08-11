package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Entities1;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int c = sc.nextInt();
		
		Entities1[] vet = new Entities1[c];
		double totAlt = 0;
		int tot16 = 0;
		for (int i = 1; i <= vet.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + i + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vet[i - 1] = new Entities1(nome, idade, altura);
			totAlt += altura;
			if (idade < 16) {
				tot16 += 1;
			}
		}
		double mediaAlt = totAlt / vet.length;
		double mediaId = ((double)tot16 / vet.length) * 100;
		System.out.printf("Altura média: %.2f%n", mediaAlt);
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", mediaId) + "%");		
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getIdade() < 16) {
				System.out.println(vet[i].getNome());
			}
		}
		
		sc.close();
	}

}
