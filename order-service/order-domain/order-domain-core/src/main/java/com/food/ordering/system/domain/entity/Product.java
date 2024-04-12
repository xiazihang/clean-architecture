package com.food.ordering.system.domain.entity;

import com.food.ordering.system.domain.valueobject.Money;
import com.food.ordering.system.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
	private final String name;
	private final Money price;

	public Product(ProductId id, String name, Money price) {
		super.setId(id);
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Money getPrice() {
		return price;
	}
}
