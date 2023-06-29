package com.example.spring_transport.model;

import org.springframework.beans.factory.annotation.Qualifier;

public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void start(){
        System.out.println(name + " управляет " + transport.getClass().getSimpleName());
    }
}
