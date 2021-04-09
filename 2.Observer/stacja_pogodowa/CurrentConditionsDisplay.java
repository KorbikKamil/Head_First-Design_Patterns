package stacja_pogodowa;

import java.util.Observable;
import java.util.Observer;

//java.util.Observer and Observable are deprecated since JAVA 9
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
//  private Subject weatherData;

    public CurrentConditionsDisplay(/*Subject weatherData*/ Observable observable) {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(/*float temperature, float humidity, float pressure*/ Observable obs, Object arg) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
        if(obs instanceof BetterWeatherData){
            BetterWeatherData weatherData = (BetterWeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
