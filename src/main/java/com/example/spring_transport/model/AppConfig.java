package com.example.spring_transport.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public Car getCar() {
        return new Car();
    }
    @Bean
    public Bus getBus(){
        return new Bus();
    }
    @Bean
    public Pickup getPickup(){
        return new Pickup();
    }

    @Bean ("driver1")
    @Scope("prototype")
    public Driver getDriver1(){
        return new Driver("driver1", getCar());
    }
    @Bean ("driver2")
    @Scope("prototype")
    public Driver getDriver2(){
        return new Driver("driver2", getBus());
    }
    @Bean ("driver3")
    @Scope("prototype")
    public Driver getDriver3(){
        return new Driver("driver3", getPickup());
    }
}
