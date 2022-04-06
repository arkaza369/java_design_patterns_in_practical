package com.arkaza.patterns.singleton;

import java.io.Serializable;

public class DateUtilsLazyAdvanced implements Serializable,Cloneable {
	
	private static final long serialVersionUID = 1L;
	private static volatile DateUtilsLazyAdvanced instance = null;

	// Declare constructor of class as private

	private DateUtilsLazyAdvanced() {

	}
	// Declare a static method to get the instance of this class.

	public static DateUtilsLazyAdvanced getInstance() {
		// synchronized block is used to make getInstance() method thread safe.
		// We want to acquire a lock only when instance is null as acquiring lock at
		// class level is costly.
		if (instance == null) {
			synchronized (DateUtilsLazyAdvanced.class) {
				if (instance == null) {
					instance = new DateUtilsLazyAdvanced();
				}
			}
		}

		return instance;
	}
	
	//To resolve conflict of deserialization
	
	public Object readResolve() {
		return instance;
	}
	
	//to prevent object cloning override clone method
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
		
	}

}
