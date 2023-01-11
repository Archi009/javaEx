package com.yedam.array;

public class Array01 {
	public static void main(String[] args) {
		// 값 목록을 활용해서 배열 만들기
		int[] intAry = { 1, 2, 3, 4, 5, 6 };
		// index 0, 1, 2, 3, 4, 5
		// 총 6개의 데이터를 담을 수 있는 배열을 만들고,
		// 6개의 데이터 각 공간(index)에 맞춰 데이터를 입력한다.

		// new연산자를 활용해서 배열 만들기
		int[] intAry2 = new int[6];
		// 6개의 데이터를 담을 수 있는 공간을 새롭게 확보한다.
		// 단, 데이터는 들어있지 않다.
		intAry2[0] = 1; // 6칸을 가진 배열의 index값이0인 칸에 1이라는 데이터 삽입

		// String 데이터를 10개 넣을 수 있는 배열 생성;
		String[] strAry = new String[10];

		System.out.println("intAry의 천번째 값:" + intAry[0]);
		System.out.println("intAry의 마지막 값:" + intAry[5]);

		// for(int i=0; i<=10; i++)
		// i = 1~10 => 배열의 인덱스
		// 배열의 데이터 총 합계
		int sum = 0;
		int[] score = { 83, 90, 87 };
		for (int i = 0; i < 3; i++) {
			System.out.println(score[i]);
			sum += score[i];
		}
		System.out.println("총 합계:" + sum);
		
		
		// new 연산자 활용한 배열 생성
		int[] point;
		
		point = new int[] {83,90,87};
		
		sum = 0; 
		for(int i = 0; i<3; i ++) {
			System.out.println(point[i]);
			sum+=point[i];
		}
		System.out.println("총 합계:" + sum);
		
		//new 연산자 활용해서 배열, 비어있는 배열 만들기.
		int[] arr1 = new int [3];
		for(int i=0; i<3;i++) {
			System.out.println("arr1["+i+"]:" +arr1[i]) ;
		}
		//배열을 만들때 기본타입을 사용하면 비어있는 참조객체를 만들어도 기본값이 들어있다.
		//int 기본값 0  double 기본값 0.0
		arr1[0] =10 ;
		arr1[1] =10 ;
		arr1[2] =10 ;
		for(int i=0; i<3;i++) {
			System.out.println("arr1["+i+"]:" +arr1[i]) ;
		}

		
		//String 배열
		String[] arr3 = new String[3];
		for(int i=0; i<3;i++) {
			System.out.println("arr3["+i+"]:" +arr3[i]) ;
		}
		
		arr3[0]	="3월";
		arr3[1]	="11월";
		arr3[2]	="12월";
		for(int i=0; i<3;i++) {
			System.out.println("arr3["+i+"]:" +arr3[i]) ;
		}
		
		
		
		
		
		
		
		
	}
}
