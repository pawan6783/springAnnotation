package com.example.springAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(coach.getExercise());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getPassword());
		context.close();
	}

}
