package com.yedam.java;

public class Product {
	//상품의 정보를 담는 클래스
	
	
	//필드 - 해당 클래스가 가지는 모든 정보
	private String proName; // 상품명 
	private int proPrice;	// 가격
	//상속 또는 공유를 제외한고는 필드의 접근 제한자는 private
	//static을 사용하면 공유되는것을 막을 수 없다 .
	//수정된다면 수정값으로 고정되기에, 
	
	//생성자 - 인스턴스를 생성할 때 필요한 프로세스를 담은 메소드
	public Product(String proName, int proPrice) {
		this.proName = proName;
		this.proPrice = proPrice;
	}//생성자는 만들어 놓지 않았을때 기본생성자가 생성되지만,
	 //생성자를 만들어 놓았다면 그것만 사용가능하다.
	 //this는 해당 인스턴스를 가르킨다. 반드시 new연산자를 통해 접근 가능하다. 
	 //+ static이 붙은 메소드(필드에서도?)에선 this를 사용하지 못한다. static은 클래스 이름 만으로도 접근 가능하다.
	 //
	
	//메소드 - 해당 클래가 가지는 모든 기능
	//getter setter 
	//getter setter를 시작 할 때 set뒤 필드의 이름은 대문자로 시작
	public void setProName(String proName) { 
		this.proName = proName;
	}
	
	public String getProName() {
		return this.proName;
	}
	
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
		
	}
	public int getProPrice() {
		 return this.proPrice;
	}
	
	
	
}
