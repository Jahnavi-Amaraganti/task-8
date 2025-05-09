package com.elc;

public class BookDetails {
	public static void main(String[] args) {
	Book book=new Book();
	book.setBookDetails("Java Basics", "Jhon Doe", 450.0);
	String res=book.getBookDetails();
	System.out.println(res);
	}
	

}
