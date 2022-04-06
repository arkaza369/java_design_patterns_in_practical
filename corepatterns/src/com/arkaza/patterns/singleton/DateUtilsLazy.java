package com.arkaza.patterns.singleton;


//Ways to create singleton class
//1.Lazy initialization
//2.Eager initialization
public class DateUtilsLazy {

	// Declare a static member of the same class type in the class
	private static volatile DateUtilsLazy instance = null;

	// Declare constructor of class as private

	private DateUtilsLazy() {

	}
	// Declare a static method to get the instance of this class.

	public static DateUtilsLazy getInstance() {
		// synchronized block is used to make getInstance() method thread safe.
		// We want to acquire a lock only when instance is null as acquiring lock at
		// class level is costly.
		if (instance == null) {
			synchronized (DateUtilsLazy.class) {
				if (instance == null) {
					instance = new DateUtilsLazy();
				}
			}
		}

		return instance;
	}
	
}
