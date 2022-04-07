package com.arkaza.patterns.adapter;

public class WeatherAdapter {

	public int getTemperature(int zipcode) {
		String city = null;
		if (zipcode == 800020) {
			city = "Patna";
		}
		WeatherFinder weatherfinder = new WeatherFinderImpl();
		int temprature = weatherfinder.find(city);

		return temprature;

	}

}
