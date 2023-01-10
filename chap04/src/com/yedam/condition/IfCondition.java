package com.yedam.condition;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90 이상이고, 등급 A");
		}
		//실행문이 한 줄 일때만 사용 {}생략 //사용 비추
		if(score>=90)
			System.out.println("점수가 90이상이고, 등급 A");
			System.out.println("스코어가 90");//if 문에 포함되지 않음
		
		
		//if-else
		if(score>=90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");			
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println(" 등급은 B입니다.");
		}
		
		//else - if
		//if문(조건식을 여러개 사용 할 때)
		score = 70;
		if(score>=90) {
			System.out.println("등급 A");
			
		}else if (score>=80) {
			System.out.println("등급 B");
		}else if (score>=70) {
			System.out.println("등급 C");
		}else {
			System.out.println("등급 D");
		}
		
		//if의 연속 
		score = 95;
		if(score>=90) {
			System.out.println("=등급 A");			
		}
		if(score>=80) {
			System.out.println("=등급 B");			
		}
		if(score>=70) {
			System.out.println("=등급 C");
			
		}else {
			System.out.println("=등급 D");
		}
		
		//if-else-if는 순차적으로 진행하되 조건이 만족되는 조건에서만 출력하고 끝이지만
		//if 연속 문은 순차적으로 각각의 조건을 비교하고 모두 출력한다.
		
		
		//random 값 추출
		//Random() / Math.random()
		//0 <= Math.random() <1 => 0 ~ 0.9xxx
		System.out.println(Math.random());
		//0 * 10 <=Math.random() * 10 < 1*10
		
		//=> 0<= Math.random() * 10 < 10
		// int number = (int)5.12;
		
		//0 ~ 9.xxxx => (int) 0 ~ (int) 9
		//(int) 0 <= (int) Math.random() *10 < (int) 10
		
		//0 ~ 9 => 1 ~ 10
		//(int) 0+ 1 <= (int) Math.random() * 10 +1 < (int) 10 +1
		
			
	
		
		
		//주사위 번호 뽑기
		                     //0 <= x < 1
							 //0 * 6 <= x * 6 < 1 *6
							 //0 <= x*6 < 6.xxxxx
							 //0 <= (int) x*6 <6
							 //0 +1 <= (int) x*6+1 <6+1
		  					 //1<= (int) (x*6)+1 < 7  =>1~6
		int number = (int) (Math.random()*6) + 1;
		
		if(number ==1 ){
			System.out.println("1번 나옴");
		}else if(number ==2 ){
			System.out.println("2번 나옴");
		}else if(number ==3 ){
			System.out.println("3번 나옴");
		}else if(number ==4 ){
			System.out.println("4번 나옴");
		}else if(number ==5 ){
			System.out.println("5번 나옴");
		}else if(number ==6 ){
			System.out.println("6번 나옴");
		}
		
		
		//중첩 if문
		//data -> 조건 여러 번 검색
		/*if(조건식) {
			if(조건식) {
				if(조건식) {
					
				}
			}
		}*/
		int no = 10;
		//no가 2의 배수
		if(no %2 ==0) {
			//no가 5의 배수
			if(no%5 == 0) {
				//no가 10의 배
				if(no% 10 ==0) {
					System.out.println("no는 10의 배수입니다.");
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수입력>");
		
		score = Integer.parseInt(sc.nextLine());
		String grade ="";
		if(score>= 90) {
			if(score>=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}
		System.out.println("획득한 학점 :" + grade);
		
	}
}
