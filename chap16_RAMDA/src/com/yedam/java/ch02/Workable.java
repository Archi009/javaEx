package com.yedam.java.ch02;

@FunctionalInterface //람다식을 쓸것이니 추상 메소드 하나를 반드시 포함해라
//위 선언으로 이건 람다식을 위한 추상메소드라는 뜻
public interface Workable {
	public void work();	
}
