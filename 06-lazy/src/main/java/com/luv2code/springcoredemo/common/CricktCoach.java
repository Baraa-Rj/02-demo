package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricktCoach implements Coach {
    CricktCoach() {
        System.out.println("CricktCoach: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!!!!!!!!!!!!!!";
    }
}
