package Aula5;

import java.util.Locale;
import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		/*int x;
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		if (x > 5) {
			System.out.println("O Número que você digitou é maior que 5");
		} else {
			System.out.println("O Número que você digitou é menor que 5");
		}*/
		
		/*int hora;
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
			} else {
				System.out.println("Boa noite!");
			}*/
		
		System.out.println("Por quantos minutos você utilizou o telefone?");
		int minutos = sc.nextInt();
		double conta = 50.00;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.00;
		}
		
		System.out.printf("Valor a pagar:R$%.2f%n", conta);
		
		sc.close();

	}

}
