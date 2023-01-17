package com.yedam.java.example;

public class LeastJob implements Scheduler{
//	현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 배분
	@Override
	public void sendCallToAgent() {
		System.out.println("쉬는 상담원에게 전화를 줍니다.");
	}

	@Override
	public void getNextCall() {
		System.out.println("현재 상담업무가 없거나 대기가 가장 적은 상담원에게 할당합니다.");
	}

}
