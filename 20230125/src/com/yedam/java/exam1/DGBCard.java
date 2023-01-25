package com.yedam.java.exam1;

public class DGBCard extends Card {
//	필드
	private String company = "대구은행";
	private String cardStaff;

//	생성자
	DGBCard(String cardNo, String valiDate, int cvc, String cardStaff) {
		super(cardNo, valiDate, cvc);
		this.cardStaff = cardStaff;
	}

//	메소드
	public String getCompany() {
		return company;
	}

	public String getCardstaff() {
		return cardStaff;
	}

	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - " + this.cardStaff + "," + this.company);
	}

}
