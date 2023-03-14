package com.example.springboot8jdk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.example.springboot8jdk")
public class ComponentConfig {
    @Bean
    public Servicing getServicing(){
        return new Servicing();
    }
}
