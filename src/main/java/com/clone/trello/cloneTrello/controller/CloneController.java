package com.clone.trello.cloneTrello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clone.trello.cloneTrello.model.Card;
import com.clone.trello.cloneTrello.service.CardService;
import com.clone.trello.cloneTrello.service.ColumnService;
import com.clone.trello.cloneTrello.service.LabelService;
import com.clone.trello.cloneTrello.service.UserService;

@RestController
@RequestMapping("/")
public class CloneController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private LabelService labelService;
	
	@Autowired
	private CardService cardService;
	
	@Autowired
	private ColumnService columnService;
	
	//1. Build a search service to list all cards containing a tag
	@GetMapping("/searchCard/{type}/{value}")
	public List<Card> searchCardByTag(@PathVariable("type") String type, 
			@PathVariable("value") String value) {
		List<Card> list = null;
		
		if(type.equalsIgnoreCase("USER")) {
			list = userService.fetchAllCards(value);
		} else if(type.equalsIgnoreCase("tag")) {
			list = labelService.fetchAllCards(value);
		} else if(type.equalsIgnoreCase("column")) {
			list = columnService.fetchAllCards(value);
		} else if(type.equalsIgnoreCase("time")) {
			list = cardService.fetchAllCards(value);
		}		
		
		return list;
	}
	
	

}
