package stacja_pogodowa;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        BetterWeatherData betterWeatherData = new BetterWeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(betterWeatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(betterWeatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(26.6f, 65, 1013.1f);
        System.out.println();
        weatherData.setMeasurements(27.7f, 70, 997.0f);
        System.out.println();
        weatherData.setMeasurements(25.5f, 90, 997.0f);
    }
}
