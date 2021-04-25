package com.clone.trello.cloneTrello.model;

import java.util.List;

import javax.persistence.ManyToMany;

public class Column {
	
	@ManyToMany
	List<Board> boards;
	

}
