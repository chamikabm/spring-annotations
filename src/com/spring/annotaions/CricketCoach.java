package com.spring.annotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    // Define init method. [For prototype scoped beans only this life cycle method get executed.]
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("Cricket Coach: inside init method -> doMyStartUpStuff.");
    }

    // Define destroy method. [For prototype scoped beans this life cycle will not get executed.]
    @PreDestroy
    public void doMyCleanUpStuff(){
        System.out.println("Cricket Coach: inside destroy method -> doMyCleanUpStuff");
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
