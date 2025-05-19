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
		int n = sc.nextInt();
		int fat = 0;
		if (n == 0) {
			fat = 1;
		} else {
			fat = n * (n - 1);
			for (int c = n - 2; c > 1; c--) {
				fat *= c;
			}
		}

		System.out.println(fat);
		
		sc.close();
	}

}
