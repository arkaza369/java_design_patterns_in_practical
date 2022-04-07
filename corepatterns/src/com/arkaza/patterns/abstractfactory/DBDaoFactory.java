package com.arkaza.patterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

	public Dao createDao(String type) {
		Dao dao=null;
		if(type.equals("Emp")) {
			dao=new DBEmpDao();
		}
		if(type.equals("Dept")) {
			dao=new DBDeptDao();
		}
		return dao;
	}

}
