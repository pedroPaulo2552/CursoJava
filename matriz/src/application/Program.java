package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int l =0; l < n; l++) {
			for (int c = 0; c < n; c++) {
				mat[l][c] = sc.nextInt();
			}
		}
		
		int numerosNeg = 0;
		System.out.println("Main diagonal:");
		for (int l =0; l < n; l++) {
			for (int c = 0; c < n; c++) {
				if (l == c) {
					System.out.print(mat[l][c] + "  ");
				}
				if (mat[l][c] < 0) {
					numerosNeg++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers = " + numerosNeg);
		
		sc.close();

	}

}
