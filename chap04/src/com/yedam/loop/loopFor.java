package com.yedam.loop;

import java.util.Scanner;

public class loopFor {
	public static void main(String[] args) {
		//for 문
		
		for (int i=0; i<=100;i++) {
			System.out.println(i);
		}
		
		//1부터 100까지의 합 구하기
		int result = 0;
		for(int i =0 ; i<=100;i++) {
			result +=i; //result = result+i
		}
		
		System.out.println("1~100까지의 합 :"+result);
		
		//1~100 사이의 짝수 구하기 
		//짝수의 성질 => 2로 나누었을때 나머지가 0으로 떨어지면 짝수.
		
		for(int i = 1; i<=100; i++) {
			if(i%2 == 0) {
				System.out.println(i+"는 짝수");
			}else if (!(i%2==0)) {
				System.out.println(i+"는 홀수");
			}
		}
		
		//입력한 숫자에 대한 구구단 출력
		//스캐너를 활용해서 값을 하나 입력 
		// 입력 받은 값에 대한 구구단 출력
		// 2를 입력 -> 2*1 = 2... 2*9 =18
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력>");
		
		int gugu = Integer.parseInt((sc.nextLine()));
		
		for(int i =1; i<=9; i++ ) {
			System.out.println(gugu+"*"+i+"="+(gugu*i));
		}
		
		//입력한 값에 대한 총합, 평균, 최대값, 최소값, 데이터 받을 갯수
		//스캐너 -> 데이터 입력 
		//데이터 받을 갯수 -> 5
		//데이터 입력 횟수가 5번 : 1, 20, 40, 30, 10
		// 총합 :값을 입력 받을 때마다 변수에 저장
		//평균 : 총합 / 갯수
		//최대값 : 입력 할 때 마다 비교 최대값인지 아닌지
		//최소값 : 입력 할 때 마다 비교, 최소값인지
		
		System.out.println("갯수>");
		int a = Integer.parseInt((sc.nextLine()));		
		int results1 = 0;
		int Max1 = -2147483647;
		int Min1 = 2147483647;
		for(int i=1; i<= a; i++) {
			int n = Integer.parseInt((sc.nextLine()));
			results1 += n;
			if(Min1 > n) {
				Min1 = n;
			}else if(Max1 < n) {
				Max1 = n;
			}		
		}
		System.out.println("총합:"+results1);
		System.out.println("평균:"+(double)results1/a);
		System.out.println("최대:"+Max1);
		System.out.println("최소:"+Min1);
		
		
		//교수 풀이 
		System.out.println("갯수>");
		int count = Integer.parseInt((sc.nextLine()));	
		int total = 0;
		int min = 0;
		int max = 0;
		
		for(int i =0 ; i< count; i++) {
			
		}
		System.out.printf("평균: %5.2f", (double)total/count);
		
		
		//2번 up and down
		//임의의 랜덤 값 (1~100) 추출하여 5번의 기회안에
		//해당 랜덤값을 맞추는 프로그램을 구현 하라.
		//예시) 랜덤값 : 50
		//		입력값 : 30
		//		=>  더 큰수를 입력하세요
		// 		입력밧: 40
		//		=>더 큰수를 입력하세요
		// 		입력값 :70
		//      =>더 작은 수를 입력하세요
		//		정답일 경우
		// 		=> 정답입니다
		// 		5번 기회 동안 못 맞출경우 
		// 		=> 실패 하였습니다.
		
		int radm = (int)(Math.random()*100)+1;		
		
		for(int i = 0; i < 5;i++) {
			System.out.println("정답 입력>>");
			int num = Integer.parseInt((sc.nextLine()));
			if(num<radm) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(num>radm) {
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("정답입니다.");
			}
			if(i==5) {
				System.out.println("5번의 기회 모두 소진");
			}
			
		}
		
		
		
		
		
	}	
}
