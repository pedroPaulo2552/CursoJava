package Aula6;

import java.util.Scanner;

public class WhileEnquanto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cont = 0;
		while (num != 0) {
			cont += num;
			num = sc.nextInt();
		}
		System.out.println("A soma dos números foi " + cont);
		
		
		
		sc.close();
	}

}
