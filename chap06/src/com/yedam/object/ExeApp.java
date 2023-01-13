package com.yedam.object;

public class ExeApp {
public static void main(String[] args) {
	//Book클래스 
	//책의 종류 , 가격 , 출판사, 도서 번호의 정보
	//정보는 원하는 방식 아무거나 활용해서 정보 입력.
	//getInfo 메소드 객체가 가진 정보 출력.
	//getInfo의 출력 예시
	//혼자 공부하는 자바
	//#내용
	//1)종류 : 학습서
	//2)가격 : 240000원
	//3)출판사 : 한빞미디어
	//4)도서번호 :yedam-001
	
	//다른 예시
	//혼자 공부하는 자바
	//#내용
	//1)종류 : 학습서
	//2)가격 : 32000원
	//3)출판사 : 한빞미디어
	//4)도서번호 :yedam-002
	Book b1 = new Book("혼자 공부하는 자바","학습서",24000,"한빛미디어","yedam-001");
	Book b2 = new Book("이게 리눅스다","노동서",30000,"누룩미디어","yedam-021");
	b1.getInfo();
	System.out.println("=========================");
	b2.getInfo();
	
	Car car1 = new Car();
	System.out.println(car1.company);
	System.out.println();
	
	Car car2 = new Car();
	System.out.println(car2.company);
	System.out.println(car2.model);
	System.out.println();
	
	
	Calculator ca = new Calculator();
	double result = ca.sub(1, 1);
	System.out.println(result);
	
	ca.powerOn();
	ca.powerOff();
	
	ca.sum2(1,2,3,4,5,6,7,8,9,10);
	ca.sum2(1,2,4,5,2,46,2,54);
	
	int sumResult = ca.sum2(1,23,4,55,2,6);
			System.out.println("총합 :" +sumResult);
	sumResult = ca.sum2(1,3,1,3,2,1,4,3);
	System.out.println("총합 :"+sumResult);
	
	
	Score sc = new Score(50,30,70);
	
	sc.getInfo();
	
	System.out.println("A");
	System.out.println(1);
	System.out.println('C');
	System.out.println(0.1);
	System.out.println(true);
	
	MethodA mt = new MethodA();
	mt.areRectangle(3);
	mt.areRectangle(3,4);
	
	
	
}
}
