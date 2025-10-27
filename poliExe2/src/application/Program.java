package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int c = 1; c <= n; c++) {
			System.out.println("Product #" + c + " data:");
			System.out.print("Commo, used or imported(c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			} else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dateString = sc.next();
				LocalDate date = LocalDate.parse(dateString, fmt);
				list.add(new UsedProduct(name, price, date));
			} else {
				list.add(new Product(name, price));
			}
		}
		System.out.println();
		for (Product i : list) {
			System.out.println(i.priceTag());
		}
		

		
		sc.close();
	}

}
