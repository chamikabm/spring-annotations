package com.spring.annotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    /*
    In general, when using Annotations, for the default bean name, Spring uses the following rule.

    If the annotation's value doesn't indicate a bean name, an appropriate name will be built based on
    the short name of the class (with the first letter lower-cased).

     >>>>  For example:

     >>>>  HappyFortuneService --> happyFortuneService
     */

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;


/*
    However, for the special case of when BOTH the first and second characters of
    the class name are upper case, then the name is NOT converted.

    >>>>  For the case of RESTFortuneService

    >>>>  RESTFortuneService --> RESTFortuneService

    @Autowired
    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;

 */

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
