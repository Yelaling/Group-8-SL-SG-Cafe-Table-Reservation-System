package com.reserve.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {
	@Id
	
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int Fid;
	private String name;
	private String description;
	private String image;
	private double price;
	private String quantity;
	
	@Override
	public String toString() {
		return "Items [Fid=" + Fid + ", name=" + name + ", description=" + description + ", image=" + image + ", price="
				+ price + ", quantity=" + quantity + "]";
	}

	public Items(int fid, String name, String description, String image, double price, String quantity) {
		super();
		Fid = fid;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
		this.quantity = quantity;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Items() {}
	
	
	public int getFid() {
		return Fid;
	}
	public void setFid(int fid) {
		Fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
