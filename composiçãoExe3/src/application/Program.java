package application;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enuns.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDateString = sc.nextLine();
		LocalDate birthDate = LocalDate.parse(birthDateString, Order.fmt2);
		
		Client clientData = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine().toUpperCase();
		Instant moment = Instant.now();
		Order order = new Order(moment, OrderStatus.valueOf(status), clientData);
		
		System.out.print("How many items to this order? ");
		int quantityOrder = sc.nextInt();
		
		for (int c = 0; c < quantityOrder; c++) {
			sc.nextLine();
			System.out.println("Enter #" + (c + 1) + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantityProduct = sc.nextInt();
			Product product = new Product(productName, price);
			OrderItem orderItem = new OrderItem(quantityProduct, price, product);
			order.addItem(orderItem);
		}
		
		System.out.println(order);
		
		
		
		
		sc.close();
	}

}
