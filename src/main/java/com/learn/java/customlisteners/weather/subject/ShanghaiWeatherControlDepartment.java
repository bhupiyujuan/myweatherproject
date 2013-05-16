package com.learn.java.customlisteners.weather.subject;

import java.util.ArrayList;
import java.util.List;

import com.learn.java.customlisteners.weather.WeatherInfo;
import com.learn.java.customlisteners.weather.WeatherListener;

public class ShanghaiWeatherControlDepartment implements
		ChinaWeatherControlDepartment {

	List<WeatherListener> listeners = new ArrayList<WeatherListener>();
	List<WeatherListener> deviatedListeners = new ArrayList<WeatherListener>();
	WeatherInfo weatherInfo;

	public WeatherInfo getWeatherInfo() {
		return weatherInfo;
	}

	public void setWeatherInfo(WeatherInfo weatherInfo) {
		this.weatherInfo = weatherInfo;
	}

	public void addWeatherListener(WeatherListener listener) {
		listeners.add(listener);
	}

	public void removeWeatherListener(WeatherListener listener) {
		listeners.remove(listener);
	}

	public void updateListener(WeatherListener listener) {
		listener.listenWeather(getWeatherInfo());
	}

	public void updateAllListeners() {
		for (WeatherListener listener : listeners) {
			if (deviatedListeners.contains(listener)) {
				listener.listenWeather(getWeatherInfo());
			}else{
				listener.listenWeather(getWeatherInfo());
			}
		}
	}
	
	public void addDeviatedWeatherListners(WeatherListener listener) {
		deviatedListeners.add(listener);
	}

}
