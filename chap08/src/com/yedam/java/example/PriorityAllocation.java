package com.yedam.java.example;

public class PriorityAllocation implements Scheduler{
//	고객의 우선순위에 따라 상담원이 대응 합니다.
	
	@Override
	public void sendCallToAgent() {
		System.out.println("업무 스킬이 좋은 상담원에게 우선적으로 배분합니다.");
	}

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

}
