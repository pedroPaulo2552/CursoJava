package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int c = sc.nextInt();
		
		Aluno[] vet = new Aluno[c];
		
		for (int i = 1; i <= vet.length; i++) {
			sc.nextLine();
			System.out.println("DADOS DO " + i + "o ALUNO:");
			System.out.print("NOME: ");
			String nome = sc.nextLine();
			System.out.print("PRIMEIRA NOTA: ");
			double priNota = sc.nextDouble();
			System.out.print("SEGUNDA NOTA: ");
			double segNota = sc.nextDouble();
			double media = (priNota + segNota) / 2;
			vet[i - 1] = new Aluno(nome, priNota, segNota, media);
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getMedia() >= 6.0) {
				System.out.println(vet[i].getNome());
			}
		}
		
		sc.close();

	}

}
