package com.elc;

public class Product {
	public String productName;
	public int productId;
	public double price;
	public  void setProductDetails(String name , int id , double prc) {
		productName=name;
		productId=id;
		price=prc;
	}
	public String getProductDetails()
	{
		return "Name of the product:" +productName +"\n Id of the product:" +productId +"\n price of the product: "+price ;
		
	}

}
