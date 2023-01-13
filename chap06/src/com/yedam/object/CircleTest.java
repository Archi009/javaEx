package com.yedam.object;
public class CircleTest {
	public static void main(String[] args) {
		//static = 정적 = 공유
		//클래스 파일 로딩시에 메모리에 할당됨
		//객체 생성없이 클래스 이름으로 접근가능
		//Circle.pi = 3.5; final을 써서 수정 불가
		System.out.println(Circle.pi);
		//반지른이 5인 원의 면적 계산
		//circle 객체 생성
		Circle c = new Circle();
		//반지름 5초기화
		//c.r = 5;
		
		//area
		double area = c.area();
		//결과 출력
		System.out.println(area);
		
		Circle c2 = new Circle();
		//c2.r = 10;
		CircleSingle circleSingle=
				CircleSingle.getInstance();
		System.out.println(circleSingle.pi);
	
	}
}
