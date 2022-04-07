package com.arkaza.patterns.factory;

public class VeggiePizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing Veggie pizza..");

	}

	public void bake() {
		System.out.println("Baking Veggie pizza..");

	}

	public void cut() {
		System.out.println("Cutting Veggie pizza..");

	}

}
