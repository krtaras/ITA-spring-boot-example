package com.test.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.spring.entity.Item;
import com.test.spring.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}
	
	public void createItem(String name, String description) {
		Item item = new Item();
		item.setName(name);
		item.setDescription(description);
		itemRepository.save(item);
	}
}
