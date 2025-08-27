package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Salario;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> id = new ArrayList<>();
		List<String> name = new ArrayList<>();
		List<Salario> salary = new ArrayList<>();
		
		System.out.print("Quantos empregados vão ser registrados? ");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + (i + 1));
			System.out.print("ID: ");
			int numId = sc.nextInt();
			id.add(numId);
			sc.nextLine();
			System.out.print("Nome: ");
			String funcName = sc.nextLine();
			name.add(funcName);
			System.out.print("Salario: ");
			double sal = sc.nextDouble();
			salary.add(new Salario(sal));
		}
		System.out.println();
		
		System.out.print("Informe o ID do funcionario que receberá o aumento: ");
		int idAumento = sc.nextInt();
		int idEscolhido = id.indexOf(idAumento);
		if (idEscolhido != -1) {
			System.out.print("Informe a porcentagem: ");
			double porc = sc.nextDouble();
			salary.get(idEscolhido).aumento(porc);
			System.out.println();
		} else {
			System.out.println("Esse ID não existe!");
			System.out.println();
		}
		
		System.out.println("Lista dos funcionarios:");
		for (int i = 0; i < n; i++) {
			System.out.println(id.get(i) + ", " + name.get(i) + ", " + salary.get(i).getSalary());
		}
		
		sc.close();

	}

}
