package com.learn.java.customlisteners.weather;

public class WeatherInfo {
	
	private double weatherDegree;
	private double currentDeviation;

	public void setCurrentDeviation(double currentDeviation) {
		this.currentDeviation = currentDeviation;
	}

	public double getCurrentDeviation() {
		return currentDeviation;
	}

	public double getWeatherDegree() {
		return weatherDegree;
	}

	public void setWeatherDegree(double weatherDegree) {
		this.weatherDegree = weatherDegree;
	}

	public WeatherInfo(double weatherDegree) {
		this.weatherDegree = weatherDegree;
	}
}
