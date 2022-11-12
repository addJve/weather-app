package com.addjve.weatherappapi.model;

public enum City {
    KYIV("Kyiv",50.4422, 30.5367),
    BERLIN("Berlin", 52.5235, 13.4115),
    PARIS("Paris", 48.8567, 2.3510),
    LONDON("London", 51.5002, -0.1262),
    MADRID("Madrid", 40.4167, -3.7033),
    VIENNA("Vienna", 48.2092, 16.3728),
    BRUSSELS("Brussels", 50.8371, 4.3676),
    SOFIA("Sofia", 42.7105, 23.3238),
    COPENHAGEN("Copenhagen", 55.6763, 12.5681),
    ATHENS("Athens", 37.9792, 23.7166),
    BUDAPEST("Budapest", 47.4984, 19.0408),
    REYKJAVIK("Reykjavik", 64.1353, -21.8952),
    DUBLIN("Dublin", 53.3441, -6.2675),
    ROME("Rome", 52.3738, 12.4823),
    AMSTERDAM("Amsterdam", 50.8371, 4.8910),
    OSLO("Oslo", 59.9138, 10.7387),
    WARSAW("Warsaw", 52.2297, 21.0122),
    LISBON("Lisbon", 38.7072, -9.1355),
    BERN("Bern", 46.9480, 7.4481),
    STOCKHOLM("Stockholm", 59.3328, 18.0645)
    ;

    private final String cityName;
    private final double latitude;
    private final double longitude;
    City(String cityName, double latitude, double longitude) {
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String getCityName(){
        return cityName;
    }
    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }
}
