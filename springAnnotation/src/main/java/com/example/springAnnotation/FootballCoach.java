package com.example.springAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Scope("singleton")
public class FootballCoach implements MyCoach{
	
	private FortuneService fortuneService;
	
	@Autowired
	public FootballCoach(@Qualifier("happyFortune") FortuneService fortuneService) {
		super();
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
	}

	public String getExercise() {
		// TODO Auto-generated method stub
		return "Do football practice for 2 hrs.";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doStartStuff() {
		System.out.println("PostConstruct method");
	}
	
	@PreDestroy
	public void doDestroyStuff() {
		System.out.println("PreDestroy method");
	}

}
