package com.yedam.java.exam1;

public class DGBCard extends Card {
//	필드
	private String company = "대구은행";
	String cardStaff;
//	생성자
	DGBCard(String cardNo, String valiDate, int cvc,String cardStaff) {
		super(cardNo, valiDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	
//	메소드
	@Override
	public void showCardInfo() {
		System.out.printf("카드정보 ( Card No : %s , 유효기간 : %s , CVC : %d )%n",this.getCardNo() ,this.getValiDate(), this.getCvc());
		System.out.println("담당직원 - "+this.cardStaff+","+this.company);
	}

}
