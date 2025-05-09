package com.elc;

public class ProductDetails {
	public static void main (String[] args) {
	Product obj=new Product();
	obj.setProductDetails("Laptop", 501, 75000.0);
	String res=obj.getProductDetails();
	System.out.println(res);
	}

}
