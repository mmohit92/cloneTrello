package com.clone.trello.cloneTrello.model;

import java.util.List;

import javax.persistence.OneToMany;


public class User {
	
	@OneToMany
	private List<Card> cards;

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

}
