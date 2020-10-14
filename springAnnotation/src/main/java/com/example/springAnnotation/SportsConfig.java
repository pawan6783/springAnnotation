package com.example.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:configure.properties")
@ComponentScan("com.example.springAnnotation")
public class SportsConfig {
	@Bean
	public FortuneService happyFortune() {
		return new HappyFortune();
	}
	
	@Bean
	public MyCoach footballCoach() {
		FootballCoach footballCoach = new FootballCoach(happyFortune());
		return footballCoach;
	}
	
	@Bean 
	public SwimCoach swimCoach() {
		SwimCoach swimCoach = new SwimCoach(happyFortune());
		return swimCoach;
	}
}
