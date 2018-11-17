package com.spring.annotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    // This constructor not required added for check the Beans creation.
    public CricketCoach() {
        System.out.println("Inside the default constructor of the Cricket Coach Bean.");
    }

    @Override
    public String getDailyWorkout() {
        return "Do 50 catch for the evening practices.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
