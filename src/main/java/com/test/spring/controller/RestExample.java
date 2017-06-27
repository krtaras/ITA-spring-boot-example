package com.test.spring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.spring.entity.Item;
import com.test.spring.service.ItemService;

@RestController
@RequestMapping("/api")
public class RestExample {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/items", method=RequestMethod.GET)
	public Collection<Item> getItems() {
		return itemService.getAllItems();
	}
	
	@RequestMapping(value="/items", method=RequestMethod.POST)
	ResponseEntity<?> addItem(@RequestBody Item item) {
		itemService.createItem(item.getName(), item.getDescription());
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
