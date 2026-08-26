package com.luv2code.springcoredemo.common;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
// define the scope of the bean as prototype
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    //define our init method
    @PostConstruct
    public void startup() {
        System.out.println("initiating: " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void cleanup() {
        System.out.println("cleaning: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

}
