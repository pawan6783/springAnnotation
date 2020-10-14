package com.example.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements MyCoach{
	@Autowired
	@Qualifier("databaseFortune")
	private FortuneService fortuneService;
	
	public String getExercise() {
		// TODO Auto-generated method stub
		return "DO Cricket practice for 4 hrs.";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

