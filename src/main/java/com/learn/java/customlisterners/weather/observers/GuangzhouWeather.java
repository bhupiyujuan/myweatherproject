package com.learn.java.customlisterners.weather.observers;

import com.learn.java.customlisteners.weather.WeatherInfo;
import com.learn.java.customlisteners.weather.WeatherListener;

public class GuangzhouWeather implements WeatherListener {

	public void listenWeather(WeatherInfo weatherInfo) {
		System.out.println("current weather for guangzhou "+ weatherInfo.getWeatherDegree());
	}

}
