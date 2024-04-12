package com.food.ordering.system.domain.entity;

import com.food.ordering.system.domain.valueobject.*;

import java.util.List;

public class Order extends AggregateRoot<OrderId> {
	private final CustomerId customerId;
	private final RestaurantId restaurantId;
	private final Address address;
	private final Money price;
	private final List<OrderItem> orderItems;
	private TrackingId trackingId;
	private OrderStatus orderStatus;
	private List<String> errorMessages;

	public Order(OrderId orderId,
	             CustomerId customerId,
	             RestaurantId restaurantId,
	             Address address,
	             Money price,
	             List<OrderItem> orderItems) {
		super.setId(orderId);
		this.customerId = customerId;
		this.restaurantId = restaurantId;
		this.address = address;
		this.price = price;
		this.orderItems = orderItems;
	}
}
