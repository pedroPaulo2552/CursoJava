package entities;

public class Product {
	public String Name;
	public double Price;
	public int Quant;
	
	public void Entrada(int x) {
		Quant = Quant + x;
	}
	
	public void Saida(int y) {
		if (y < Quant) {
			Quant = Quant - y;
		} else {
			Quant = 0;
		}
	}
	
	public double total() {
		return Quant * Price;
	}
	
	public String ShowProduct() {
		return "Info do produto: " + Name + ", $ " + String.format("%.2f", Price) + ", " + Quant + " units, Total: $ " + String.format("%.2f", total());
	}
}
