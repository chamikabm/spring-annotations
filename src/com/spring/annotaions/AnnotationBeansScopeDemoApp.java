package com.spring.annotaions;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeansScopeDemoApp {

    public static void main(String[] args){

        // Load Spring config file.
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve Tennis Coach Beans from Spring IoC Container.
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaTennisCoach = context.getBean("tennisCoach", Coach.class);

        /**
         *  Tennis coach scope is singleton, which is the default scope for any Spring Bean. Which means it will return
         *  the same at every time we request a Tennis Bean from the container.
         */

        // Check if the Tennis Coach Beans are same.
        if (tennisCoach == alphaTennisCoach) {
            System.out.println("Both Bean References are Same.");
        } else {
            System.out.println("Bean References are different.");
        }

        // Print memory locations of the Cricket Coach Beans.
        System.out.println("Memory location of the tennisCoach Bean : " + tennisCoach);
        System.out.println("Memory location of the alphaTennisCoach Bean : " + alphaTennisCoach);


        System.out.println();
        System.out.println("***********************************************");
        System.out.println();

        /**
         * Cricket coach's scope is set to prototype by using @Scope annotation in the Bean. Which means every time
         * when we request a bean from the container it will create a new CricketCoach bean for us.
         */

        // Retrieve Cricket Coach Beans from Spring IoC Container.
        Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
        Coach alphaCricketCoach = context.getBean("cricketCoach", Coach.class);

        // Check if the Cricket Coach Beans are same.
        if (cricketCoach == alphaCricketCoach) {
            System.out.println("Both Bean References are Same.");
        } else {
            System.out.println("Bean References are different.");
        }

        // Print memory locations of the Cricket Coach Beans.
        System.out.println("Memory location of the cricketCoach Bean : " + cricketCoach);
        System.out.println("Memory location of the alphaCricketCoach Bean : " + alphaCricketCoach);

        // Close the context.
        context.close();
    }
}
