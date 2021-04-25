package com.clone.trello.cloneTrello.service;

import java.util.List;

import com.clone.trello.cloneTrello.model.Card;

public interface LabelService {

	List<Card> fetchAllCards(String value);

}
