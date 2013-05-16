package com.learn.java.customlisterners.weather.observers;

import com.learn.java.customlisteners.weather.WeatherInfo;
import com.learn.java.customlisteners.weather.WeatherListener;

public class ShenzhenWeather implements WeatherListener {

	public void listenWeather(WeatherInfo weatherInfo) {
		System.out.println("current weather for shenzhen "+ weatherInfo.getWeatherDegree());
	}
}
