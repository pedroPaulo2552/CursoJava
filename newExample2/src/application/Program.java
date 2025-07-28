package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Nome do produto: ");
		String name = sc.nextLine();
		System.out.print("Preço do produto: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quant = sc.nextInt();
		Product produto1 = new Product(name, price, quant);
		
		produto1.ShowProduct();
		System.out.println("---------------------------------------------------");
		System.out.println("[1] para realizar entrada no estoque");
		System.out.println("[2] para realizar saída no estoque");
		int res;
		String res2;
		do {
			res = sc.nextInt();
			switch (res) {
				case 1:
					System.out.print("Digite a quantidade de Entrada: ");
					int ent = sc.nextInt();
					produto1.Entrada(ent);
					System.out.println(produto1.ShowProduct());
					produto1.ShowProduct();
					break;
				
				case 2:
					System.out.print("Digite a quantidade de Saída: ");
					int sai = sc.nextInt();
					produto1.Saida(sai);
					System.out.println(produto1.ShowProduct());
					break;
			};
			System.out.print("Quer continuar? s/n: ");
			res2 = sc.next();
		} while (res2.equals("s"));
		
		
		sc.close();
	}

}
