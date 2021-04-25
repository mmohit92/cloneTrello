package com.clone.trello.cloneTrello.model;

import java.util.List;

import javax.persistence.ManyToMany;

public class Card {
	
	@ManyToMany
	List<Column> columns;
	
	@ManyToMany
	List<Label> labels;
	
	@ManyToMany
	List<User> users;

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
