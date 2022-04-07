package com.arkaza.patterns.factory;

public class CheesePizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing cheese pizza..");

	}

	public void bake() {
		System.out.println("Baking cheese pizza..");

	}

	public void cut() {
		System.out.println("Cutting cheese pizza..");

	}

}
