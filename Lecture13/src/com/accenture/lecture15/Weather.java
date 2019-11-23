package com.accenture.lecture15;

import java.util.Arrays;

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
	public String toString(){
		return "Weather forecast in " + this.country + " for next days" + Arrays.toString(this.getDaysWeather());
	}
}

// Create toString method in Weather class
// Output: "Weather forecast in 'Latvia' for next days '-2, 0, 5, 2, 6, -1, 0'"
// System.out.println(latvia);