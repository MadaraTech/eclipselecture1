package com.accenture.lecture15;

public class Weather {
	private final String country;
	private int[] daysWeather;

	public String getCountry() {
		return country;
	}

	public int[] getDaysWeather(){
		return daysWeather;
	}
	public Weather(String country, int[] daysWeather) {
		this.country = country;
		this.daysWeather = daysWeather;

	}
}
