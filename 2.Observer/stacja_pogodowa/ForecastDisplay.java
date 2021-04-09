package stacja_pogodowa;

import java.util.Observer;
import java.util.Observable;

public class ForecastDisplay implements Observer, DisplayElement {
    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;
    //private WeatherData weatherData;

    public ForecastDisplay(/*WeatherData weatherData*/ Observable observable) {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
        BetterWeatherData weatherData = (BetterWeatherData) observable;
        observable.addObserver(this);
    }


    public void update(/*float temp, float humidity, float pressure*/ Observable obs, Object arg) {
        if(observable instanceof BetterWeatherData) {
            BetterWeatherData weatherData = (BetterWeatherData) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
