package com.yedam.java.exam1;

public class TossCard extends Card {
//  필드
	private String company = "Toss";
	private String cardStaff ;
	
	


	//	생성자
	TossCard(String cardNo, String valiDate, int cvc,String cardStaff) {
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
		System.out.println("카드정보 - Card No, "+this.getCardNo());
		System.out.println("담당직원 - "+this.cardStaff+","+this.company);
	}	
}
