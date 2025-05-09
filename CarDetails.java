package com.elc;

public class CarDetails {
public static void main(String[] args)
{
	Car car=new Car();
	car.setCarDetails("swift", "maruti", 60000.0);
	String res=car.getCarDetails();
	System.out.println(res);
}
}
