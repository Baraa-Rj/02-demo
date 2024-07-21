package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasketBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on basket ball practice";
    }
}
