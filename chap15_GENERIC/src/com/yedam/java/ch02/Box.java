package com.yedam.java.ch02;
//제네릭 타입 예시
public class Box<T> { //클래스, 인터페이스를 변수로 넣는 느낌?
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
