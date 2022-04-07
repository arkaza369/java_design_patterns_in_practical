package com.arkaza.patterns.factory;

public class PizzaStore {
	
	public void orderPizza(String type) {
		Pizza p=PizzaFactory.createPizza(type);
		p.prepare();
		p.bake();
		p.cut();
		
	}
	

}
