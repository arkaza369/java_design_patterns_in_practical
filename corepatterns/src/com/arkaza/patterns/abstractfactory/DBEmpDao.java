package com.arkaza.patterns.abstractfactory;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Emp details to DB..");
	}

}
