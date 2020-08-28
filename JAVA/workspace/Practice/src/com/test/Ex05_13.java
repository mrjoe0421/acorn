package com.test;

public class Ex05_13 {
	
	public static void changeBook(Book book) {
		book.title = "Java8";
		book.price = 3000;
	}

	public static void main(String[] args) {
	
		Book book = new Book("Java", "인경열", 2000);
		System.out.println("main의 변경전 info:" + book.getInfo());
		changeBook(book);
		System.out.println("main의 변경 후 info: " + book.getInfo());
	}

}
