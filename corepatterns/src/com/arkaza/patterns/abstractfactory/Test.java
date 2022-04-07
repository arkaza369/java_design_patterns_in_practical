package com.arkaza.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {
		DaoAbstractFactory daoFactory=DaoFactoryProducer.produce("db");
		Dao dao=daoFactory.createDao("Emp");
		dao.save();
		
	}

}
