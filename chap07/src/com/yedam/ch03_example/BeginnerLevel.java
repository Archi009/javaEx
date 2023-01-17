package com.yedam.ch03_example;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("현 레벨에서는 실행 불가 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("현 레벨에서는 실행 불가 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****초보자 레벨입니다.*****");
	}

	
}
