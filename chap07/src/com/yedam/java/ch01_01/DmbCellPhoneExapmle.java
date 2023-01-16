package com.yedam.java.ch01_01;

public class DmbCellPhoneExapmle {
	public static void main(String[] args) {
		// DmbCellPhone 인스턴스
		DmbCellPhone dmbCellPhone = new DmbCellPhone("삼성 갤럭시 노트 9", "white", 10);

		// CellPhone의 필드
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색깔 : " + dmbCellPhone.color);

		// DmbCellPhone의 필드
		System.out.println("채널 : " + dmbCellPhone.channel);

		// CellPhone의 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 길동입니다. 호이");

		// DmbCellPhone의 메소드
		dmbCellPhone.turnOnDmb();
	}
}
