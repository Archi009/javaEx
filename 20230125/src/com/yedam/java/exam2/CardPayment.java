package com.yedam.java.exam2;

public class CardPayment implements Payment{
//	필드
	double cardRatio;
//	생성자
	public CardPayment(double cardRatio) {
		this.cardRatio = cardRatio;
	}
//	메서드
	@Override
	public int online(int price) {
		double ratio = ONLINE_PAYMENT_RATIO +cardRatio;
		int result = (int)(price *(1- ratio));
		return result;
	}
	@Override
	public int offline(int price) {
		double ratio = OFFLINE_PAYMENT_RATIO +cardRatio;
		int result = (int)(price *(1- ratio));
		return result;
	}
	@Override
	public void showInfo() {
		System.out.println("***카드로 결제 시 할인정보");
		System.out.println("온라인 결제 시 총 할인율"+(ONLINE_PAYMENT_RATIO+cardRatio));
		System.out.println("오프라인 결제 시 총 할인율"+(OFFLINE_PAYMENT_RATIO+cardRatio));
	}
	
}
