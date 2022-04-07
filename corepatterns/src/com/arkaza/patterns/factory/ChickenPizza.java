package com.arkaza.patterns.factory;

public class ChickenPizza implements Pizza {

	public void prepare() {
		System.out.println("Preparing Chicken pizza..");

	}

	public void bake() {
		System.out.println("Baking Chicken pizza..");

	}

	public void cut() {
		System.out.println("Cutting Chicken pizza..");

	}

}
