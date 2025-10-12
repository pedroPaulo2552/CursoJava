package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enuns.OrderStatus;

public class Order {
	private Instant moment;
	private OrderStatus status;
	private Client clientData;
	private List<OrderItem> orderItem = new ArrayList<>();
	public static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
	public static final DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Order() {
	}

	public Order(Instant moment, OrderStatus status, Client clientData) {
		this.moment = moment;
		this.status = status;
		this.clientData = clientData;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClientData() {
		return clientData;
	}

	public void setClientData(Client clientData) {
		this.clientData = clientData;
	}
	
	public void addItem(OrderItem item) {
		this.orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.orderItem.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for (OrderItem c : this.orderItem) {
			total += c.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:" + "\n");
		sb.append("Order moment: " + Order.fmt.format(moment) + "\n");
		sb.append("Order status:" + this.status + "\n");
		sb.append("Client: " + this.clientData.getName() + " (" + this.clientData.getBirthDate().format(fmt2) + ") - " + this.clientData.getEmail() + "\n");
		sb.append("Order items: " + "\n");
		for (OrderItem c : this.orderItem) {
			sb.append(c + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", this.total()));
		return sb.toString();
	}
	
	
	
}
