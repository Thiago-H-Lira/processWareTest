package com.processware.tecnicalTest.domain;

import java.util.HashSet;
import java.util.Set;

public class Box implements Content {

	private String description;

	private Set<Content> contents = new HashSet<>();

	public Box(String description, Set<Content> contents) {
		super();
		this.description = description;
		if (contents != null) {
			this.contents = contents;
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Content> getContents() {
		return contents;
	}

}
