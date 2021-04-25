package com.clone.trello;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

import com.clone.trello.cloneTrello.model.Card;
import com.clone.trello.cloneTrello.service.UserService;

public class UserServiceImpl {
	
	@InjectMocks
	UserService userService;
	
	@Test
	public void fetchAllCardTest() {
		List<Card> output = null;
		List<Card> list = userService.fetchAllCards("UserValue");
		Assert.assertEquals(list, output);
	}

}
