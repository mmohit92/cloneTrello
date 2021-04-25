package com.clone.trello;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

import com.clone.trello.cloneTrello.model.Card;
import com.clone.trello.cloneTrello.service.CardService;

public class CardServiceImplTest {
	
	@InjectMocks
	CardService cardService;
	
	@Test
	public void fetchAllCard(){
		List<Card> output = null;
		List<Card> list = cardService.fetchAllCardsByTime(null);
		Assert.assertEquals(output, list);
	}

}
