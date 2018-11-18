package com.test.beans;

import java.io.Serializable;

public class Book implements Serializable {
private String name;
private int id;
private float price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [name=" + name + ", id=" + id + ", price=" + price + "]";
}


}
