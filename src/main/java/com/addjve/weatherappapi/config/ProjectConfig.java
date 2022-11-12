package com.addjve.weatherappapi.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.addjve.weatherappapi")
public class ProjectConfig {

}
