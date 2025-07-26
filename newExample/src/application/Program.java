package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Product produto1 = new Product();
		System.out.println("Nome do produto:");
		produto1.Name = sc.nextLine();
		System.out.println("Preço do produto:");
		produto1.Price = sc.nextDouble();
		System.out.println("Quantidade em estoque:");
		produto1.Quant = sc.nextInt();
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
					System.out.println("Digite a quantidade de Entrada");
					int ent = sc.nextInt();
					produto1.Entrada(ent);
					produto1.ShowProduct();
					break;
				
				case 2:
					System.out.println("Digite a quantidade de Saída");
					int sai = sc.nextInt();
					produto1.Saida(sai);
					produto1.ShowProduct();
					break;
			};
			System.out.println("Quer continuar? s/n");
			res2 = sc.next();
		} while (res2.equals("s"));
		
		
		sc.close();
	}

}
