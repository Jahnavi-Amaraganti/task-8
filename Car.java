package com.elc;
public class Car {
	private String model;
	private String company;
	private double price;
	public void setCarDetails(String m , String c, double p) {
	model=m;
	company=c;
	price=p;
	}
	public String getCarDetails() {
	return "model of the car:" +model +"\n car company:" +company +"\n price of the car:" +price;
}
	
}
