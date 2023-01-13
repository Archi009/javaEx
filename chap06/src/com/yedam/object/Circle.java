package com.yedam.object;

//클래스 선언
/*
 * static 필드    : public
 * instance 필드  : private
 * 생성자			 : public
 * getter, setter :public
 * 메서드			  :public (일부 private있음)
 * 
 */


public class Circle {

	//필드 
	static final double pi = 3.14;
	private double r;//캡슐화
	
	//r read/write //setR getR
	public void setR(double r) {
		this.r = r;
	}
	//생성자
	public Circle(double r){
		this.r = r;
	}
	public Circle(){
		
	}
	
	//메소드 
	public double area(){
		double result = pi * r * r;
		return result;
		}
}
