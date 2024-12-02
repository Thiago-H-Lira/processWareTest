package com.processware.tecnicalTest.domain;

public class Item implements Content {

	private String description;
	private Integer quantity;

	public Item(String description, Integer quantity) {
		super();
		this.description = description;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
