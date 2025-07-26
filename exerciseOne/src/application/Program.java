package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		System.out.print("Base do Retângulo: ");
		ret.width = sc.nextDouble();
		System.out.print("Altura do Retângulo: ");
		ret.height = sc.nextDouble();
		System.out.println();
		System.out.printf("AREA = %.2f%n", ret.area());
		System.out.printf("PERÍMETRO = %.2f%n", ret.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());
		sc.close();
	}

}
