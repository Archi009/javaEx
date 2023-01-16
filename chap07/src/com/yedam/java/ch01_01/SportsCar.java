package com.yedam.java.ch01_01;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	public void carStop() {
		super.stop();
		//this.maxSpeed = 400; final이 붙는 순간 값을 변화시킬수 없다
		// static final이 붙으면 상수로서 작용된다.
	}
	//메소드를 오버라이딩시에 final이 붙은 것은 불가하다.but 부모 호출로 사용은 가능하다.
	
}
