package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on basket ball practice";
    }
}
