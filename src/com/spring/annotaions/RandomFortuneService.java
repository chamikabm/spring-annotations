package com.spring.annotaions;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // Create array of Strings.
    private String[] data = {
            "Beware of the wolfs in the sheep's clothing.",
            "Diligence is the mother of good luck.",
            "The journey is the reward."
    };

    // Create a random number generator.
    private Random random = new Random();

    @Override
    public String getFortune() {
        // Pick a random number
        int randomNumber = random.nextInt(data.length);

        // Pick the relevant random String from the Strings array.
        return data[randomNumber];
    }
}
