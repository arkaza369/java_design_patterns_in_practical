package com.arkaza.patterns.facade;

public class OrderProcessor {
	public boolean checkStock(String name) {
		System.out.println("Checking Stock..");
		return true;
	}
	public String placeOrder(String name,int quantity) {
		System.out.println("Order Placed");
		return "abc";
		
	}
	public void shipOrder(String name) {
		System.out.println("Order Shipped");
		
	}

}
