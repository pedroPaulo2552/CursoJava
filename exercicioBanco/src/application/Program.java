package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO BANCO JAVA");
		System.out.println("PARA REALIZAR O CADASTRO INFORME OS SEGUINTES DADOS");
		System.out.print("NOME: ");
		String nome = sc.nextLine();
		System.out.print("NUMERO DA CONTA: ");
		int numeroDaConta = sc.nextInt();
		Conta conta = new Conta(nome, numeroDaConta);
		System.out.print("IRÁ REALIZAR UM DEPOSITO INICIAL? s/n ");
		String resposta = sc.next();
		
		double valor;
		if (resposta.equals("s")) {
			System.out.print("DEPOSITO INICIAL: ");
			valor = sc.nextDouble();
			conta.deposito(valor);
		}
		
		System.out.println();
		System.out.println("ATUALIZAÇÃO DA CONTA:");
		System.out.println("CONTA: " + conta.getNumeroDaconta() + ", TITULAR: " + conta.getNome() + ", SALDO: $ " + conta.getSaldo());
		System.out.println();
		
		System.out.print("VALOR DO DEPOSITO: ");
		valor = sc.nextDouble();
		conta.deposito(valor);
		System.out.println("ATUALIZAÇÃO DA CONTA:");
		System.out.println("CONTA: " + conta.getNumeroDaconta() + ", TITULAR: " + conta.getNome() + ", SALDO: $ " + conta.getSaldo());
		System.out.println();
		
		System.out.print("VALOR DO SAQUE: ");
		valor = sc.nextDouble();
		conta.saque(valor);
		System.out.println("ATUALIZAÇÃO DA CONTA:");
		System.out.println("CONTA: " + conta.getNumeroDaconta() + ", TITULAR: " + conta.getNome() + ", SALDO: $ " + conta.getSaldo());
		
		sc.close();
	}

}
