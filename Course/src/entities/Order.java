package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;

	private Client client;

	private List<OrderItem> orderItem = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}

	public Double total() {
		Double sum = 0.0;
		for (OrderItem c : orderItem) {
			sum += c.subTotal();
		}
		return sum;
	}

}
