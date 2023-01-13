package com.yedam.object;

public class CircleSingle {
	//싱들톤 선언
	private static CircleSingle singleton = new CircleSingle();
	private CircleSingle() {}
	static CircleSingle getInstance() {
		return singleton;
	}
	
	
	//필드 
	static final double pi = 3.14;
	double r;
	
	
	//생성자
	CircleSingle(double r){
		this.r = r;
	}

//	CircleSingle(){
//		
//	}
//	
	//메소드 
	double area(){
		double result = pi * r * r;
		return result;
		}
}
