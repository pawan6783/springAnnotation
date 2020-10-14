package com.example.springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortune implements FortuneService{

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Database fortune";
	}

}
