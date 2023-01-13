package com.yedam.ch06;

public class Car {
	
	
	//필드
	private int speed;
	private int maxSpeed;
	private String model;
	
	
	
	//생성자
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = 0;

	}	
	public String getModel() {
		return this.model;
	}
	public int getMaxspeed() {
		return this.maxSpeed;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
		
		
		
	//메소드
		
		
	}

