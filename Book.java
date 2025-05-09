package com.elc;

public class Book {
	private String title;
	private String author;
	private double price;
	public void setBookDetails(String t, String a, double p) {
		title=t;
		author=a;
		price=p;
	}
 public String getBookDetails()
 {
	 return "title of the book:" +title +"\n author of the book:" +author +"\n price of the book:" +price;
 }
}
