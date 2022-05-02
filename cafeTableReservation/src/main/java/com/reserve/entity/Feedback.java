package com.reserve.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	
	private int rating;
	private String description;
	private String name;
	
	public Feedback(){}

	public Feedback(int id, int rating, String description, String name) {
		super();
		this.id = id;
		this.rating = rating;
		this.description = description;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", rating=" + rating + ", description=" + description + ", name=" + name + "]";
	}
	
	

}
