package com.newproject.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    public String  getDailyWorkout() {
        return "Practice fast passing for 15 min";
    }
}

