package com.example.springAnnotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService{

	public String getFortune() {
		// TODO Auto-generated method stub
		return "You are lucky today";
	}

}
