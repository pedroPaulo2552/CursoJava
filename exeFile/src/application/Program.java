package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path = "c:\\Exercicio\\Source.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			Product[] products = new Product[4];
			for(int i = 0; line != null; i++) {
				String [] vect = line.split(",");
				Double price = Double.parseDouble(vect[1]);
				int quantity = Integer.parseInt(vect[2]);
				products[i] = new Product(vect[0], price, quantity);
				line = br.readLine();
			}
			
			
			File path3 = new File(path);
			new File(path3.getParent() + "\\out").mkdir();
			String path2 = "C:\\Exercicio\\out\\summary.csv";
			try(BufferedWriter br2 = new BufferedWriter(new FileWriter(path2))) {
				for (Product p : products) {
					br2.write(String.valueOf(p));
					br2.newLine();
				}
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
