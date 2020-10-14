package com.example.springAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //constructor injection
        MyCoach coach1 = context.getBean("footballCoach",MyCoach.class);
        System.out.println(coach1.getExercise());
        System.out.println(coach1.getDailyFortune());
        
        //setter injection (method injection)
        MyCoach coach2 = context.getBean("tennisCoach",MyCoach.class);
        System.out.println(coach2.getExercise());
        System.out.println(coach2.getDailyFortune());
        
        //field injection
        MyCoach coach3 = context.getBean("cricketCoach",MyCoach.class);
        System.out.println(coach3.getExercise());
        System.out.println(coach3.getDailyFortune());
        
    
        context.close();
    }
}
