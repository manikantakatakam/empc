package com.employee.empc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Adjust the path as needed
                .allowedOrigins("*") // Replace with your allowed origin
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}