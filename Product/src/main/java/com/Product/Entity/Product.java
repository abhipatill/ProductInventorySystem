package com.Product.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Product {

	@Id
	private int id;
	private String name;
	private int price;
	private int mfg;
	private int exp;

	public Product() {
		super();
	}

	public Product(int id, String name, int price, int mfg, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.mfg = mfg;
		this.exp = exp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMfg() {
		return mfg;
	}

	public void setMfg(int mfg) {
		this.mfg = mfg;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", mfg=" + mfg + ", exp=" + exp + "]";
	}

}
