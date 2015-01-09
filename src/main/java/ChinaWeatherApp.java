import com.learn.java.customlisteners.weather.WeatherInfo;
import com.learn.java.customlisteners.weather.WeatherListener;
import com.learn.java.customlisteners.weather.subject.ChinaWeatherControlDepartment;
import com.learn.java.customlisteners.weather.subject.GuangdongWeatherControlDepartment;
import com.learn.java.customlisteners.weather.subject.HunanWeatherControlDepartment;
import com.learn.java.customlisteners.weather.subject.ShanghaiWeatherControlDepartment;
import com.learn.java.customlisterners.weather.observers.ChangshaWeather;
import com.learn.java.customlisterners.weather.observers.DongchongShanghaiWeather;
import com.learn.java.customlisterners.weather.observers.GuangzhouWeather;
import com.learn.java.customlisterners.weather.observers.PudongWeather;
import com.learn.java.customlisterners.weather.observers.ShenzhenWeather;


public class ChinaWeatherApp {

	public static void main(String[] args) {
		//Start all publishers/subjects
		ChinaWeatherControlDepartment guangdong = new GuangdongWeatherControlDepartment();
		ChinaWeatherControlDepartment shanghai = new ShanghaiWeatherControlDepartment();
		ChinaWeatherControlDepartment hunan = new HunanWeatherControlDepartment();
		
		//Watching observers 
		WeatherListener shenzhen = new ShenzhenWeather();		
		WeatherListener guangzhou = new GuangzhouWeather();		
		WeatherListener changsha = new ChangshaWeather();		
		WeatherListener pudong = new PudongWeather();		
		WeatherListener dongchong = new DongchongShanghaiWeather();
		
		//register with their respective provinces
		guangdong.addWeatherListener(shenzhen);
		guangdong.addDeviatedWeatherListners(shenzhen);
		guangdong.addWeatherListener(guangzhou);		
		hunan.addWeatherListener(changsha);		
		shanghai.addWeatherListener(pudong);
		shanghai.addWeatherListener(dongchong);
		
		//add current weather to their cities
		WeatherInfo guangDongWeatherInfo = new WeatherInfo(23.5);
		guangdong.setWeatherInfo(guangDongWeatherInfo);
		guangDongWeatherInfo.setCurrentDeviation(0.3);
		
		
		WeatherInfo shanghaiWeatherInfo = new WeatherInfo(21.7);
		shanghai.setWeatherInfo(shanghaiWeatherInfo);
		
		WeatherInfo hunanWeatherInfo = new WeatherInfo(19.5);
		hunan.setWeatherInfo(hunanWeatherInfo);
		
		//Lets start with update all observers by their provinces
		guangdong.updateAllListeners();
		shanghai.updateAllListeners();
		hunan.updateAllListeners();
		
		
		
		
	}

}
