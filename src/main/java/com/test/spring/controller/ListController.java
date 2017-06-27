package com.test.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.spring.service.ItemService;

@Controller
@RequestMapping("/list")
public class ListController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/")
	public String getList(Model model) {
		model.addAttribute("list", itemService.getAllItems());
		return "list";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addItem(HttpServletRequest request) {
		
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		itemService.createItem(name, description);
		
		return "redirect:/list/";
	}
}
