package com.learn.java.customlisteners.weather.subject;

import com.learn.java.customlisteners.weather.WeatherInfo;
import com.learn.java.customlisteners.weather.WeatherListener;

//Abstract Subject
public interface ChinaWeatherControlDepartment {
	public void addWeatherListener(WeatherListener listener);
	public void removeWeatherListener(WeatherListener listener);	
	public void updateListener(WeatherListener listener);		
	public void updateAllListeners();
	public void setWeatherInfo(WeatherInfo weathernfo);
	public void addDeviatedWeatherListners(WeatherListener listener);
}
