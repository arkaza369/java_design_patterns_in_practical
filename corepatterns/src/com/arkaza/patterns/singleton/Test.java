package com.arkaza.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//1.test for Lazy initialization
		DateUtilsLazy dateUtils1=DateUtilsLazy.getInstance();
		DateUtilsLazy dateUtils2=DateUtilsLazy.getInstance();
		
		//2.test for Eager initialization
		DateUtilsEager dateUtils3=DateUtilsEager.getInstance();
		
		DateUtilsEager dateUtils4=DateUtilsEager.getInstance();
		//Using '==' operator for reference comparison and it will return true as both are referring to same location.
		
		System.out.println(dateUtils1==dateUtils2);
		System.out.println(dateUtils3==dateUtils4);
		
		//Both Ways are good to go but Lazy initialization is preferable.
		
		//3.Serialization and Deserialization
		DateUtilsLazyAdvanced dateUtils5=DateUtilsLazyAdvanced.getInstance();
		DateUtilsLazyAdvanced dateUtils6=null;
		
		ObjectOutputStream objout=new ObjectOutputStream(
				new FileOutputStream(new File("/Users/arkazasinghrajput/Desktop/SingletonFile/dateUtil.ser")));
		objout.writeObject(dateUtils5);
		
		ObjectInputStream objin=new ObjectInputStream(
				new FileInputStream(new File("/Users/arkazasinghrajput/Desktop/SingletonFile/dateUtil.ser")));
		dateUtils6 = (DateUtilsLazyAdvanced) objin.readObject();
		
		System.out.println(dateUtils5==dateUtils6);
		
		
	}

}
