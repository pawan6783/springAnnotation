package com.example.springAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements MyCoach{
	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public SwimCoach(FortuneService fortuneService) {
		super();
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
	}

	public String getExercise() {
		// TODO Auto-generated method stub
		return "Swim daily 500 meters";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
}
