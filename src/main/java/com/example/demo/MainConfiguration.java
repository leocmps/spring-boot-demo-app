package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {
    @Bean(name="appName")
    public String appName () {
        return "Demo Application";
    }

    @Bean(name="appVersion")
    public String appVersion () {
        return "1.0.0";
    }
}
