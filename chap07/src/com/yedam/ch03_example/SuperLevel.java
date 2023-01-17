package com.yedam.ch03_example;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빨리 딜릴수  있습니다");
	}

	@Override
	public void jump() {
		System.out.println("높이 뜁니다");
		
	}

	@Override
	public void turn() {
		System.out.println("턴 합니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****고급자.*****");
	}

}
