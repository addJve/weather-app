package com.addjve.weatherappapi.controllers;

import com.addjve.weatherappapi.model.CurrentWeather;
import com.addjve.weatherappapi.proxy.OpenWeatherApiProxy;
import com.addjve.weatherappapi.services.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class PageController {
    private final OpenWeatherApiProxy openWeatherApiProxy;
    private final WeatherService weatherService;

    public PageController(OpenWeatherApiProxy openWeatherApiProxy, WeatherService weatherService) {
        this.openWeatherApiProxy = openWeatherApiProxy;
        this.weatherService = weatherService;
    }

    @GetMapping("/")
    public String weatherPage(Model model) {
        model.addAttribute("yourCity", "YOUR CITY");
        return "index.html";
    }

    @GetMapping("/find")
    public String weatherPage(
            @RequestParam("latitude") double latitude,
            @RequestParam("longitude") double longitude,
            Model model
    ) {
        CurrentWeather currentWeather =
                Objects.requireNonNull(openWeatherApiProxy.getWeather(latitude, longitude, true)
                                .getBody())
                                .getCurrent_weather();

        model.addAttribute("weather", weatherService.weatherInterpretationCode
                (currentWeather.getWeathercode()));
        model.addAttribute("temperature", currentWeather.getTemperature());
        model.addAttribute("windspeed", currentWeather.getWindspeed());

        return "index.html";
    }

}
