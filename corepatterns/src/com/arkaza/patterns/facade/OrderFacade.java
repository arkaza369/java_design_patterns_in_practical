package com.arkaza.patterns.facade;

public class OrderFacade {
	private OrderProcessor process = new OrderProcessor();
	public void processOrder(String name,int quantity) {
		if(process.checkStock(name)) {
			String order_id=process.placeOrder(name, quantity);
			process.shipOrder(order_id);
		}
	}

}
