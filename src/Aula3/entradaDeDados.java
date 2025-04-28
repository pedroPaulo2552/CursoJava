package Aula3;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		/*
		 * String x; 
		 * x = sc.nextLine();
		 *  System.out.print("Você digitou " + x);
		 */
		
		/*
		 * int y; 
		 * y = sc.nextInt(); 
		 * System.out.println("Você digitou o número " + y);
		 */
		
		/*
		 * Double a; 
		 * a = sc.nextDouble(); 
		 * System.out.println("Você digitou o número " + a);
		 */
		
		/*
		 * char b; 
		 * b = sc.next().charAt(0); 
		 * System.out.println("A primeira letra é " +b);
		 */
		
		/* String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Você digitou a palavra: " + x);
		System.out.println("Você digitou o numero inteiro: " + y);
		System.out.println("Você digitou o número com ponto flutuante: " + z);*/
		
		
		/*int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 =sc.nextLine();
		s2 = sc.nextLine();
		s3 =sc.nextLine();
		
		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
		
		sc.close();
	}

}
