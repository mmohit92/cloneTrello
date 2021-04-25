package com.clone.trello;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

import com.clone.trello.cloneTrello.model.Card;
import com.clone.trello.cloneTrello.service.LabelService;

public class LabelServiceImplTest {
	
	@InjectMocks
	LabelService labelService;
	
	@Test
	public void fetchAllCardTest() {
		List<Card> output = null;
		List<Card> list = labelService.fetchAllCards(null);
		Assert.assertEquals(list, output);
	}

}
