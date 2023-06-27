package com.example.spring_transport.model;

import javax.annotation.PostConstruct;

public abstract class Transport {
    @PostConstruct
    public void letsStart (){
        System.out.println(this.getClass().getSimpleName() + " приступает к работе");
    }
}
