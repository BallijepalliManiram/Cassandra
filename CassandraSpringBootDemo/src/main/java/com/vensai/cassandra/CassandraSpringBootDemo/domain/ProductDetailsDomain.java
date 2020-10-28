package com.vensai.cassandra.CassandraSpringBootDemo.domain;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("productdetails")
public class ProductDetailsDomain implements Serializable {

	private static final long serialVersionUID = 1L;
	@PrimaryKey
	private UUID id;
	@Column("description")
	private String description;
	@Column("price")
	private int price;
	@Column("productname")
	private String productName;

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
