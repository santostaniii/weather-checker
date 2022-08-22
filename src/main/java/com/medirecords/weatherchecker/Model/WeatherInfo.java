package com.medirecords.weatherchecker.model;

public class WeatherInfo implements Serializable {

    private String weather;

    private String weatherDesc;

    private double temp;

    private double minTemp;

    private double maxTemp;

    public WeatherInfo(String weather, String weatherDesc, double temp, double minTemp, double maxTemp) {
        this.weather = weather;
        this.weatherDesc = weatherDesc;
        this.temp = temp;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWeatherDesc() {
        return weather;
    }

    public void setWeatherDesc(String weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

}