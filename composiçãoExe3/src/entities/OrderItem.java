package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product productData;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.productData = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		return this.price * this.quantity;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.productData.getName() + ", ");
		sb.append(" $" + String.format("%.2f", this.productData.getPrice()) + ", ");
		sb.append(" Quantity: " + this.quantity + ", ");
		sb.append(" Subtotal: $" + String.format("%.2f", this.subTotal()));
		return sb.toString();
	}
	
	
	
}
