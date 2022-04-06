package com.arkaza.patterns.singleton;

//Ways to create singleton class
//1.Lazy initialization
//2.Eager initialization

public class DateUtilsEager {
	//one way to initialize the instance

	private static DateUtilsEager instance = new DateUtilsEager();
	
	/*2nd way through static block.This will get execute when class is loaded into memory.Both ways are correct.
	 * private static DateUtilsEager instance ;
	 * static{
	 * 	instance = new DateUtilsEager();
	 * }
	 * 
	
	*/

	private DateUtilsEager() {

	}



	public static DateUtilsEager getInstance() {
		return instance;
	}

}
