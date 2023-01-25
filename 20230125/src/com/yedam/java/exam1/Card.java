package com.yedam.java.exam1;

public class Card {
	// 필드
	private String cardNo;
	private String valiDate;
	private int cvc;

	// 생성자
	Card(String cardNo, String valiDate, int cvc) {
		this.cardNo = cardNo;
		this.valiDate = valiDate;
		this.cvc = cvc;
	}

	// 메소드
	public String getCardNo() {
		return cardNo;
	}

	public String getValiDate() {
		return valiDate;
	}

	public int getCvc() {
		return cvc;
	}

	public void showCardInfo() {
		System.out.printf("Card No : %s , 유효기간 : %s , CVC : %d", this.getCardNo(), this.getValiDate(), this.getCvc());
	}
}
