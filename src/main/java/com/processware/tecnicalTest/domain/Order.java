package com.processware.tecnicalTest.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private Integer id;
	private List<Content> contents = new ArrayList<>();

	public Order(Integer id, List<Content> contents) {
		super();
		this.id = id;
		if (contents != null) {
			this.contents = contents;
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Content> getContent() {
		return contents;
	}

}
