package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class correcao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("Quantos quartos vão ser alugados? ");
		int n =sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Aluguel #" + i);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();
			vect[roomNumber] = new Rent(name, email);
		}
		System.out.println();
		
		System.out.println("Quartos alugados:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();

	}

}
