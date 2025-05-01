package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*double num;
		System.out.println("Digite um número:");
		num = sc.nextDouble();
		if (num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}*/
		
		/*System.out.println("Digite um número:");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("O número " + n + " é PAR");
		} else {
			System.out.println("O número " + n + " é IMPAR");
		}*/
		
		/*System.out.println("Digite os números:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > y) {
			if (x % y == 0) {
				System.out.println("São Multiplos");
			} else {
				System.out.println("Não são Multiplos");
			}
		} else if (y > x) {
			if (y % x == 0) {
				System.out.println("São Multiplos");
			} else {
				System.out.println("Não são Multiplos");
			}
		}*/
		
		/*System.out.println("Digite a hora em que o jogo iniciou:");
		int ini = sc.nextInt();
		System.out.println("Digite o horario em que o jogo terminou:");
		int fim = sc.nextInt();
		
		if (ini == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		if (fim > ini) {
			int res = fim - ini;
			System.out.println("O JOGO DUROU " + res + " HORA(S)");
		}
		
		if (ini > fim) {
			int res = (24 - ini) + fim;
			System.out.println("O JOGO DUROU " + res + " HORA(S)");
		}*/
		
		/*System.out.println("Digite o codigo do pedido:");
		int cod = sc.nextInt();
		System.out.println("Digite a quantidade:");
		int quant = sc.nextInt();
		
		if (cod == 1) {
			double preco = 4.00 * quant;
			System.out.printf("Total: R$ %.2f%n", preco);
		} else if (cod == 2) {
			double preco = 4.50 * quant;
			System.out.printf("Total: R$ %.2f%n", preco);
		} else if (cod == 3) {
			double preco = 5.00 * quant;
			System.out.printf("Total: R$ %.2f%n", preco);
		} else if (cod == 4) {
			double preco = 2.00 * quant;
			System.out.printf("Total: R$ %.2f%n", preco);
		} else if (cod == 5) {
			double preco = 1.50 * quant;
			System.out.printf("Total: R$ %.2f%n", preco);
		} else {
			System.out.println("Codigo invalido!");
		}*/
		
		
		/*System.out.println("Digite um número:");
		double x = sc.nextDouble();
		if (x >= 0 && x <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (x > 25 && x <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (x > 50 && x <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (x > 75 && x <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora do intervalo");
		}*/
		
		
		/*System.out.println("Digite as cordenadas x:");
		double x = sc.nextDouble();
		System.out.println("Digite as cordenadas y:");
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0 && (y > 0 || y < 0)) {
			System.out.println("Eixo Y");
		} else if (y == 0 && (x > 0 || x < 0)) {
			System.out.println("Eixo X");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}*/
		
		System.out.println("Digite o seu salario:");
		double sal = sc.nextDouble();
		
		if (sal >=0.00 && sal <=2000.00) {
			System.out.println("Isento");
		} else if (sal > 2000.00 && sal <= 3000.00) {
			double imposto = sal * (8.0/100);
			System.out.printf("R$ %.2f%n", imposto);
		} else if (sal > 3000.00 && sal <= 4500.00) {
			sal = sal - 2000.00;
			double imposto = 1000.00 * (8.0/100);
			sal = sal - 1000.00;
			imposto = imposto + (sal * (18.0/100));
			System.out.printf("R$ %.2f%n", imposto);
		} else {
			sal = sal - 2000.00;
			double imposto = 1000.00 * (8.0/100);
			imposto = imposto + (1500.00 * (18.0/100));
			sal = sal - 2500.00;
			imposto = imposto + (sal * (28.0/100));
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		
	}

}
