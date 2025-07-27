package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("PREÇO DO DOLAR: ");
		double cotacao = sc.nextDouble();
		System.out.print("QUANTIDADE DE DOLARES QUE IRÁ ADQUIRIR:US$ ");
		double dolar = sc.nextDouble();
		
		double valor = CurrencyConverter.conversor(cotacao, dolar);
		valor = CurrencyConverter.imposto(valor);
		
		System.out.printf("QUANTIDADE A PAGAR EM REAIS = R$%.2f", valor);
		
		sc.close();
	}

}
