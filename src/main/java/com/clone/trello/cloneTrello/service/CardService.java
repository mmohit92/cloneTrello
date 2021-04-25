package com.clone.trello.cloneTrello.service;

import java.util.Date;
import java.util.List;

import com.clone.trello.cloneTrello.model.Card;

public interface CardService {

	List<Card> fetchAllCards(String value);

	List<Card> fetchAllCardsByTime(Date time);

}
