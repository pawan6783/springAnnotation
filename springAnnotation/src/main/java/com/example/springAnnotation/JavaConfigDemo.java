package com.example.springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		MyCoach coach = context.getBean("footballCoach",FootballCoach.class);
		System.out.println(coach.getExercise());
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
