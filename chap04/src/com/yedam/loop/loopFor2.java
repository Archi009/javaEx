package com.yedam.loop;

public class loopFor2 {
	public static void main(String[] args) {
		//중첩 for 문
		// for(){
		//   for(){
		//  }
		//}
		
		
		// 2단 ~ 9단
		for(int i = 2;i <= 9;i++) {
			for(int j = 1;j <= 9;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
		//별찍기
		//*****
		//*****
		//*****
		//*****
		
		//한 줄, 한 줄 내려 갈 때 쓰는 반복문
		for(int i = 0; i < 5; i++) {
			//별을 찍어주는 반복문
			for(int j = 0; j < 5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//*     1줄 1개
		//**    2줄 2개
		//***	3줄 3개
		//****	4줄 4개
		//*****	5줄 5개
		
		for(int i = 1; i<=5; i++) {
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//반복문은 i값 또는 j값이 1 또는 0부터 시작하라는 법은 없다
		//*****	5줄 5개 -> i = 5 , j = 5
		//****	4줄 4개 -> i = 4 , j = 4
		//***	3줄 3개
		//**    2줄 2개
		//*     1줄 1개
		
		for(int i = 5; i >=0; i-- ) {
			for(int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
