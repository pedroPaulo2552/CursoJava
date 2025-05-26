package Aula8;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);*/
		
		int n = sc.nextInt();
		int mask = 32;
		if ((n & mask) == 32) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();
	}

}
