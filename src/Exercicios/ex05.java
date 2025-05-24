package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		/*int x = sc.nextInt();
		for (int c = 1; c <= x; c++) {
			if (c % 2 != 0) {
				System.out.println(c);
			}
		}*/
		/*int dentro = 0;
		int out = 0;
		int n = sc.nextInt();
		for(int c = 0; c < n; c++) {
			double x = sc.nextDouble();
			if (x >= 10 && x <= 20) {
				dentro += 1;
			} else {
				out += 1;
			}
		}
		
		System.out.println(dentro + " in");
		System.out.println(out + " Out");*/
		
		/*int x = sc.nextInt();
		for (int c = 0; c < x; c++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double d = sc.nextDouble();
			
			double media = ((a * 2) + (b * 3) + (d * 5))/10;
			System.out.printf("%.1f%n", media);
		}*/
		
		/*int i = sc.nextInt();
		for (int c = 0; c < i; c++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			if (n2 == 0) {
				System.out.println("Divisão Impossivel!");
			} else {
				double div = n1/n2;
				System.out.println(div);
			}
		}*/
		
		/*int n = sc.nextInt();
		if (n == 0 || n == 1) {
			int fat = 1;
			System.out.println(fat);
		} else {
			for (int c = n; c > 1; c--) {
				if (c - 1 > 0) {
					n = n * (c - 1);
				}
			}
			System.out.println(n);
		}*/
		
		/*int n = sc.nextInt();
		for (int c = n; c > 0; c--) {
			if (n % c == 0) {
				System.out.println(c);
			}
		}*/
		
		int n = sc.nextInt();
		double quad = 1;
		double cubo = 1;
		for (int c = 1; c <= n; c++) {
			quad = Math.pow(c, 2);
			cubo = Math.pow(c, 3);
			System.out.printf("%d %.0f %.0f%n", c, quad, cubo);
		}
		
		sc.close();
	}

}
