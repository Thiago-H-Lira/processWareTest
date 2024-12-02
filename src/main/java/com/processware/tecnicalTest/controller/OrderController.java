package com.processware.tecnicalTest.controller;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.processware.tecnicalTest.domain.Box;
import com.processware.tecnicalTest.domain.Item;
import com.processware.tecnicalTest.domain.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

	@GetMapping("/detail")
	@Procedure(name = "json")
	public ResponseEntity<?> orderDetail() {
		Order order = new Order(1, null);
		Box box1 = new Box("box 1", null);
		Box box2 = new Box("box 2", null);
		Box box3 = new Box("box 3", null);
		Box box4 = new Box("box 4", null);
		Item item2 = new Item("item 2", 1);
		Item item3 = new Item("item 3", 1);
		Item item4 = new Item("item 4", 2);
		box4.getContents().add(item4);
		box3.getContents().add(item3);
		box2.getContents().add(item2);
		box2.getContents().add(box3);
		box1.getContents().add(box2);
		box1.getContents().add(box3);

		order.getContent().add(box1);
		order.getContent().add(box4);

		return ResponseEntity.ok(order);

	}
}
