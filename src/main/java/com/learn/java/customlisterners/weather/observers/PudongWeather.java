package com.learn.java.customlisterners.weather.observers;

import com.learn.java.customlisteners.weather.WeatherInfo;
import com.learn.java.customlisteners.weather.WeatherListener;

public class PudongWeather implements WeatherListener {

	public void listenWeather(WeatherInfo weatherInfo) {	
		System.out.println("current weather for pudong "+ (weatherInfo.getWeatherDegree()));
	}

}
