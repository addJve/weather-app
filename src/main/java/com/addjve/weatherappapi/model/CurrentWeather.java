package com.addjve.weatherappapi.model;

public class CurrentWeather {

    private Integer weathercode;
    private Double temperature;
    private Double windspeed;
    private String time;
    private Integer winddirection;

    public Integer getWeathercode() {
        return weathercode;
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public String getTime() {
        return time;
    }

    public Integer getWinddirection() {
        return winddirection;
    }
}
