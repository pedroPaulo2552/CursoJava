package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int [][] mat = new int[l][c];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == n) {
					System.out.println("Position " + i + "," + j + ":");
					if (j != 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j + 1 != mat[i].length) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i != 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (i + 1 != mat.length) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
