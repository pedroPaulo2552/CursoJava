package Aula6;

import java.util.Scanner;

public class WhileEnquanto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		int cont = 0;
		while (num != 0) {
			num = sc.nextInt();
			if (num != 0) {cont += num;}
		}
		System.out.println("A soma dos números foi " + cont);
	}

}
