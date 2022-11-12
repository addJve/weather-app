package com.addjve.weatherappapi.model;

public class Weather {

    private Integer elevation;
    private Double generationtime_ms;
    private String timezone_abbreviation;
    private String timezone;
    private Double latitude;
    private Integer utc_offset_seconds;

    private CurrentWeather current_weather;
    private Double longitude;

    public Integer getElevation() {
        return elevation;
    }

    public Double getGenerationtime_ms() {
        return generationtime_ms;
    }

    public String getTimezone_abbreviation() {
        return timezone_abbreviation;
    }

    public String getTimezone() {
        return timezone;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Integer getUtc_offset_seconds() {
        return utc_offset_seconds;
    }

    public CurrentWeather getCurrent_weather() {
        return current_weather;
    }

    public Double getLongitude() {
        return longitude;
    }
}
