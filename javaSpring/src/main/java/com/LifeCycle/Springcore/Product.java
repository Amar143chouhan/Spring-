package com.LifeCycle.Springcore;

public class Product {
	
	
private int	price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
	//System.out.println("setting porduct price");
}

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Product [price=" + price + "]";
}

public void destroy() {
	
//	System.out.println("inside destroy method");
	
}
public void init() {
	
//	System.out.println("inside init method");
	
}

}
