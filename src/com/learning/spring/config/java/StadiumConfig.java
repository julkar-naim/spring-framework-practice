package com.learning.spring.config.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:com/learning/spring/config/java/stadium.properties")
public class StadiumConfig {
    @Bean
    public Ball baseball() {
        return new Baseball();
    }

    @Bean
    public Ball football() {
        return new Football();
    }

    @Bean
    public Ball cricketball() {
        return new Cricketball();
    }

    @Bean
    public Stadium footballStadium() {
        return new FootballStadium(football()); //constructor injection
    }

    @Bean
    public Stadium cricketStadium() {
        CricketStadium cstadium = new CricketStadium();
        cstadium.setBall(cricketball()); // setter injection
        return cstadium;
    }

    @Bean
    public Stadium baseballStadium() {
        return new BaseballStadium(); // field injection with autowired
    }
}
