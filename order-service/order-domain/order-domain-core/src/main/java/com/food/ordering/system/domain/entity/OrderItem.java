package com.food.ordering.system.domain.entity;

import com.food.ordering.system.domain.valueobject.OrderId;
import com.food.ordering.system.domain.valueobject.OrderItemId;
import com.food.ordering.system.domain.valueobject.Money;

public class OrderItem extends BaseEntity<OrderItemId> {
	private final OrderId orderId;
	private final Product product;
	private final Integer quantity;
	private final Money price;
	private final Money subTotal;

	public OrderItem(OrderItemId id, OrderId orderId, Product product, Integer quantity, Money price, Money subTotal) {
		super.setId(id);
		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
		this.subTotal = subTotal;
	}

	public Product getProduct() {
		return product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Money getPrice() {
		return price;
	}

	public Money getSubTotal() {
		return subTotal;
	}
}
