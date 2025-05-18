package Exercicios;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int ten = sc.nextInt();
		while (ten != 2002) {
			System.out.println("Senha Invalida!");
			ten = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");*/
		
		/*double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if ( x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
			
		}*/
		
		/*int codigo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (codigo != 4) {
			switch (codigo) {
			case 1:
				alcool += 1;
				codigo = sc.nextInt();
				break;
				
			case 2:
				gasolina += 1;
				codigo = sc.nextInt();
				break;
				
			case 3:
				diesel += 1;
				codigo = sc.nextInt();
				break;
				
			default:
				System.out.println("CODIGO INVALIDO! DIGITE UM NOVO CODIGO:");
				codigo = sc.nextInt();
				break;
			}
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);*/
		
		sc.close();

	}

}
