package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante aluno1 = new Estudante();
		System.out.printf("Digite o nome do aluno: ");
		aluno1.nome = sc.nextLine();
		System.out.print("Nota primeiro trimeste: ");
		aluno1.nota1 = sc.nextDouble();
		System.out.print("Nota segundo trimeste: ");
		aluno1.nota2 = sc.nextDouble();
		System.out.print("Nota terceiro trimeste: ");
		aluno1.nota3 = sc.nextDouble();
		System.out.println();
		
		System.out.println("ALUNO: " + aluno1.nome);
		System.out.printf("NOTA FINAL: %.2f%n", aluno1.notaFinal());
		aluno1.situacao();
		sc.close();

	}

}
