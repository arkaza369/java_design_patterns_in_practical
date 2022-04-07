package com.arkaza.patterns.abstractfactory;

public class XMLEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Emp details to XML..");
	}

}
