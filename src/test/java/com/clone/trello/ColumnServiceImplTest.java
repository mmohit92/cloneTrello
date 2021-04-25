package com.clone.trello;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;

import com.clone.trello.cloneTrello.model.Card;
import com.clone.trello.cloneTrello.service.ColumnService;

public class ColumnServiceImplTest {
	
	@InjectMocks
	ColumnService columnService;
	
	@Test
	public void fetchAllCard(){
		List<Card> output = null;
		List<Card> list = columnService.fetchAllCards(null);
		Assert.assertEquals(output, list);
	}

}
