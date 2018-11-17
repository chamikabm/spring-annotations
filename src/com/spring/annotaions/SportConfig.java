package com.spring.annotaions;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.annotaions") // This works exactly same as XML component scanning.
public class SportConfig {


}
