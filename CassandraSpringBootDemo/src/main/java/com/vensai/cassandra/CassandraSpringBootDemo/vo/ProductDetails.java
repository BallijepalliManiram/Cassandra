package com.vensai.cassandra.CassandraSpringBootDemo.vo;

import java.io.Serializable;
import java.util.UUID;

public class ProductDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	private UUID id;
	private String description;
	private int price;
	private String productName;

	public ProductDetails(UUID id, String description, int price, String productName) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.productName = productName;
	}

	public ProductDetails() {

	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
