package Aula6;

import java.util.Scanner;

public class forPara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*int n = sc.nextInt();
		int num;
		int soma = 0;
		
		for (int i=0; i < n; i++) {
			num = sc.nextInt();
			soma += num;
		}
		System.out.println("A soma dos valores foi " + soma);*/
		
		System.out.println("Digite o começo da contagem:");
		int i = sc.nextInt();
		System.out.println("Digite o fim da contagem:");
		int f = sc.nextInt();
		
		if (i < f) {
			for (int c = i; c <= f; c++) {
				System.out.print(c + "... ");
			}
		} else {
			for (int c = i; c >= f; c--) {
				System.out.print(c + "... ");
			}
		}
		

		sc.close();
	}

}
