package com.arkaza.patterns.factory;

public class PizzaFactory {
	
	public static Pizza createPizza(String type) {
		Pizza p=null;
		if(type.equals("Cheese")) {
			p=new CheesePizza();
		}
		else if(type.equals("Veggie")) {
			p=new VeggiePizza();
		}
		else if(type.equals("Chicken")) {
			p=new ChickenPizza();
		}
		
		return p;
		
	}

}
