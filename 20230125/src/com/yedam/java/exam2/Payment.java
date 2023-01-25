package com.yedam.java.exam2;

public interface Payment {
//	필드
	static final double ONLINE_PAYMENT_RATIO = 0.05;
	static final double OFFLINE_PAYMENT_RATIO = 0.03;
//	생성자

//	메서드
	public int online(int price);

	public int offline(int price);

	public void showInfo();

}
