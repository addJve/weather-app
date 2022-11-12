package com.addjve.weatherappapi.proxy;

import com.addjve.weatherappapi.model.CurrentWeather;
import com.addjve.weatherappapi.model.Weather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "weather",
url = "${name.service.url}")

public interface OpenWeatherApiProxy {
    @GetMapping("/v1/forecast")
    ResponseEntity<Weather> getWeather(
            @RequestParam("latitude") double latitude,
            @RequestParam("longitude") double longitude,
            @RequestParam("current_weather") boolean isCurrentWeather
    );
}
