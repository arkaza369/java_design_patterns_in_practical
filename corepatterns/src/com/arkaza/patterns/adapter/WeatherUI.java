package com.arkaza.patterns.adapter;

public class WeatherUI {
	
	public int showtemperature(int zipcode) {
		WeatherAdapter weatheradapter=new WeatherAdapter();
		int temperature=weatheradapter.getTemperature(zipcode);
		return temperature;
		
	};

	public static void main(String[] args) {
		WeatherUI weatherUI=new WeatherUI();
		System.out.print(weatherUI.showtemperature(800020));

	}

}
