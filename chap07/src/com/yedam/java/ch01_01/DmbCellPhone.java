package com.yedam.java.ch01_01;

//상속


public class DmbCellPhone extends CellPhone{
	// 필드
	int channel;
	
	
	//생성자
	public DmbCellPhone(String model, String color, int channel){
		super(model,color); //super() -> 직접적으로 부모클래스 요청
		//this.model= model; //자기자신을 통해서 1.부모 클래스의 필드에 접근 할 수 있다!!
		//this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb()	{
		System.out.println("채널 "+channel+"번 DMB 방송수신을 시작합니다.");
	}
	
	void chageChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	
	void turnPffDmb() {
		System.out.println("DMB  방송 수신을 멈춥니다.");
	}
	
	
}
