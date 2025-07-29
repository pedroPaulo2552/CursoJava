package entities;

public class Product {
	private String name;
	private double price;
	private int quant;
	
	public Product (String name, double price, int quant) {
		this.name = name;
		this.price = price;
		this.quant = quant;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuant() {
		return quant;
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
