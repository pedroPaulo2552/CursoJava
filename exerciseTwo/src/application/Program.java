package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario1 = new Funcionario();
		System.out.print("Nome do funcionario: ");
		funcionario1.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		funcionario1.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario1.imposto = sc.nextDouble();
		System.out.println();
		System.out.println("Funcionario: " + funcionario1);
		System.out.println();
		System.out.print("Porcentagem aumento de salário: ");
		double porcent = sc.nextDouble();
		funcionario1.aumentoSalario(porcent);
		System.out.println();
		System.out.println("Dados Atualizados: " + funcionario1);
		
		
		sc.close();

	}

}
