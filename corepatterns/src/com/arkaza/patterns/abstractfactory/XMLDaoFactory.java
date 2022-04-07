package com.arkaza.patterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory {

	public Dao createDao(String type) {
		Dao dao=null;
		if(type.equals("Emp")) {
			dao=new XMLEmpDao();
		}
		if(type.equals("Dept")) {
			dao=new XMLDeptDao();
		}
		return dao;
	}

}
