package com.spring.annotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    // Default constructor not required but implemented for to check the initialization order.
    public TennisCoach() {
        System.out.println("Inside the default constructor.");
    }

/*    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/


/*//     For this setter method you can have any name you want.
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside the setFortune method.");
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
