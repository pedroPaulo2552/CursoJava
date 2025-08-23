package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos vão ser alugados? ");
		int n = sc.nextInt();
		Rooms[] rooms = new Rooms[10];
		
		System.out.println();
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println("Aluguel " + (i + 1));
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			rooms[room] = new Rooms(name, email);
			System.out.println();
		}
		
		System.out.println("Quartos alugados:");
		for (int i = 0; i<rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
			}
		}
		
		
		
		
		sc.close();

	}

}
