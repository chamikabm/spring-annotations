package com.spring.annotaions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.annotaions") // We don't need to do component scan as we rely on following bean definitions.
public class SportConfig {

    // Define bean for sad fortune service.
    @Bean  // <--- Here the actual bean id will be the method name.
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }


    // Define bean for Swim Coach and Inject dependency.
    @Bean // <--- Here the actual bean id will be the method name.
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService()); // We are calling above method to inject the bean.
    }
}
