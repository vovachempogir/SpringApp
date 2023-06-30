package com.example.spring_transport.model;

import org.springframework.beans.factory.annotation.Qualifier;
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
    public Driver getDriver1(@Qualifier("car") Transport transport){
        return new Driver("driver1", transport);
    }
    @Bean ("driver2")
    @Scope("prototype")
    public Driver getDriver2(@Qualifier("bus") Transport transport){
        return new Driver("driver2", transport);
    }
    @Bean ("driver3")
    @Scope("prototype")
    public Driver getDriver3(@Qualifier("pickup")Transport transport){
        return new Driver("driver3", transport);
    }
}
