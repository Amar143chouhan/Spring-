package com.LifeCycle.Springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Item implements InitializingBean,DisposableBean{
	
	
	@Override
	public String toString() {
		return "Item [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	private double price;

	public void destroy() throws Exception {

	//	System.out.println("giving money for the item");
	}

	public void afterPropertiesSet() throws Exception {
		
		//System.out.println("taking item from the shop");
		
	}
	
	
	
	
	

}
