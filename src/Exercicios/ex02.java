package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*int x, y, s;
		x = sc.nextInt();
		y = sc.nextInt();
		s = x + y;
		System.out.println("A soma entre " + x + " + " + y + " = " + s);*/
		
		/*double r = sc.nextDouble();
		double a = 3.14159 * (Math.pow(r, 2));
		System.out.printf("Area = %.4f%n", a);*/
		
		
		/*int a, b, c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		int dif = a * b - c * d;
		System.out.println("Diferença = " + dif);*/
		
		/*System.out.println("Digite o seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite o número de horas trabalhadas: ");
		int ht = sc.nextInt();
		System.out.println("Digite quanto você ganha por hora: ");
		double sal = sc.nextDouble();
		double sal2 = sal * ht;
		System.out.println("Seus Dados:");
		System.out.println("Nome: " + nome);
		System.out.printf("Salário: %.2f%n", sal2);*/
		
		/*System.out.println("Digite o seu nome:");
		String nome = sc.nextLine();
		System.out.println("Digite o número de horas trabalhadas: ");
		int ht = sc.nextInt();
		System.out.println("Digite o seu salario: ");
		double sal = sc.nextDouble();
		double salH = sal / ht;
		System.out.println("Seus Dados:");
		System.out.println("Nome: " + nome);
		System.out.printf("Salário por hora %.2f%n", salH);*/
		
		System.out.println("Digite o codigo da peça 1: ");
		int codigo1 = sc.nextInt();
		System.out.println("Digite o numero de peças do codigo ' " + codigo1 + " ':");
		int quant1 = sc.nextInt();
		System.out.println("Digite o valor unitario da peça do codigo " + codigo1 + " ':");
		double vu1 = sc.nextDouble();
		double tot1 = vu1 * quant1;
		
		System.out.println("Digite o codigo da peça 2: ");
		int codigo2= sc.nextInt();
		System.out.println("Digite o numero de peças do codigo ' " + codigo2 + " ':");
		int quant2 = sc.nextInt();
		System.out.println("Digite o valor unitario da peça do codigo " + codigo2 + " ':");
		double vu2 = sc.nextDouble();
		double tot2 = vu2 * quant2;
		
		double total = tot1 + tot2;
		System.out.printf("Valor a pagar: R$ %.2f%n", total);
		
		/*double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double triangulo = (a * c)/2;
		double circ = 3.14159 * Math.pow(c, 2);
		double trap = (a + b) * (c / 2);
		double quad = Math.pow(b, 2);
		double reta = a * b;
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circ);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quad);
		System.out.printf("RETANGULO: %.3f%n", reta);
		sc.close();*/
	}

}
