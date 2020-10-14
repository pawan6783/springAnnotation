package com.example.springAnnotation;

public class SwimCoach implements MyCoach{
	private FortuneService fortuneService;

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
