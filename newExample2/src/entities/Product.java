package entities;

public class Product {
	public String name;
	public double price;
	public int quant;
	
	public Product (String name, double price, int quant) {
		this.name = name;
		this.price = price;
		this.quant = quant;
	}
	
	
	public void Entrada(int x) {
		quant = quant + x;
	}
	
	public void Saida(int y) {
		if (y < quant) {
			quant = quant - y;
		} else {
			quant = 0;
		}
	}
	
	public double total() {
		return quant * price;
	}
	
	public String ShowProduct() {
		return "Info do produto: " + name + ", $ " + String.format("%.2f", price) + ", " + quant + " units, Total: $ " + String.format("%.2f", total());
	}
}
