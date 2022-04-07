package com.arkaza.patterns.abstractfactory;

public class DaoFactoryProducer {
	public static DaoAbstractFactory produce(String factorytype) {
		DaoAbstractFactory daofactory=null;
		if(factorytype.equals("xml")){
			daofactory=new XMLDaoFactory();
		}
		else if(factorytype.equals("db")){
			daofactory=new DBDaoFactory();
		}
		return daofactory;
	}
}
