package com.luv2code.springcoredemo.common;
import org.springframework.stereotype.Component;

@Component
// define the scope of the bean as prototype
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

}
