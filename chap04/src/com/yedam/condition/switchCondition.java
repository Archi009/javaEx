package com.yedam.condition;

import java.util.Scanner;

public class switchCondition {
	public static void main(String[] args) {
		int number = (int) (Math.random()*6) + 1;
		System.out.println(number);
		//switch 문은 == 값만 구분 가능
		switch (number) {
		case 1:
			System.out.println("1번 나옴");
			break;
		case 2:
			System.out.println("2번 나옴");
			break;
		case 3:
			System.out.println("3번 나옴");
			break;
		case 4:
			System.out.println("4번 나옴");
			break;
		case 5:
			System.out.println("5번 나옴");
			break;
		default: //else와 같다, 없어도 됨; case 만으로 문장을 완성해도 된다
			System.out.println("6번 나옴");
			break;
		}
		
		
		
		
		//char
		
		char grade = 'B';
		
		switch(grade) {
		case'A':
			System.out.println("우수회원");
			break;
		case'B': //사이에 break가 없다면 둘 중 하나만 만족해도 아래 결과값을 출력한다
		case'b':
			System.out.println("일반회원");
			break;	 
		default:
			System.out.println("손님");
			break;
		}
		Scanner sc = new Scanner(System.in);
				//0~100
				//99~90 A
				//89~80	B
				//79~70	C
				//69~60 D
				System.out.println("입력>");
				int scores = Integer.parseInt(sc.nextLine());						
				switch (scores/10) {
				case 10:
				case 9:
					System.out.println("A등급");
					break;
				case 8:
					System.out.println("B등급");
					break;
				case 7:
					System.out.println("C등급");
					break;
				case 6:
					System.out.println("D등급");
					break;
				}
		
		
		
		
		
		
		
		
	}
}
