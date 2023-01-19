package com.yedam.java.ch01;

public class MainExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get(); //만약 뭐가 담겨있는지 모른다면.
//		강제 타입 변환을 할 때 타입선택에 문제가 생긴다.(뭔지 모르니까!)
		
		box.set(1000);
		int price = (Integer)box.get();
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		
		
	}

}


class Apple{}