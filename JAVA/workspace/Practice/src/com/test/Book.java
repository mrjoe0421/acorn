package com.test;

public class Book {
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getInfo() {
		return title + "\t" + author + "\t" + price;
	}
}
