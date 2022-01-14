package com.ramjava;

import com.ramjava.entity.ThemeParkRide;
import com.ramjava.repository.ThemeParkRideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThemeParkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThemeParkApplication.class);
    }

    @Bean
    public CommandLineRunner sampleData(ThemeParkRideRepository themeParkRideRepository) {
        return args -> {
            new ThemeParkRide("Rollercoaste", "Train ride that speeds you along", 5, 3);
            new ThemeParkRide("Long flume", "Boat ri", 5, 3);
            new ThemeParkRide("Rollercoaste", "Train ride that speeds you along", 5, 3);
        };
    }
}
