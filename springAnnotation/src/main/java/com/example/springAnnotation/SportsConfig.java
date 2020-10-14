package com.example.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.springAnnotation")
public class SportsConfig {
	@Bean
	public FortuneService happyFortune() {
		return new HappyFortune();
	}
	
	@Bean
	public MyCoach footballCoach() {
		FootballCoach footballCoach = new FootballCoach(happyFortune());
		return footballCoach();
	}
}
