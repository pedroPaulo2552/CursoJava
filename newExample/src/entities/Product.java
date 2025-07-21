package entities;

public class Product {
	public String Name;
	public double Price;
	public int Quant;
	
	public void Entrada(int x) {
		Quant = Quant + x;
	}
	
	public void Saida(int y) {
		Quant = Quant - y;
	}
	
	public void ShowProduct() {
		System.out.println("Nome do produto: " + Name);
		System.out.println("Preço do produto: " + Price);
		System.out.println("Quantidade em estoque: " + Quant);
	}
}
