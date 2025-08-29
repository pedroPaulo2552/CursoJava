package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int l = 3;
		int c = 2;
		int y = 6;
		
		int[][][] mat = new int [l][c][y];
		System.out.println(mat.length);
		System.out.println(mat[0].length);
		System.out.println(mat[0][0].length);
		
		sc.close();

	}

}
