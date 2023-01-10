package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {
	public static void main(String[] args) throws IOException {
//		keyCode 하나의 문자를 받아 올때
		int keyCode = 0;
		
		System.out.println("입력>");
		keyCode = System.in.read();
		System.out.println("keyCode :"+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode :"+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode :"+keyCode);

//		Scanner
	    Scanner scanner = new Scanner(System.in);
		
		System.out.println("임력>");
//		scanner.nextLine() 
//		=>enter키 이전까지 데이터를 받아오세요	
//  	enter키를 기준으로 데이터를 읽어옴. 엔터키 를 포함해서 가져옴
		String inputData = scanner.nextLine();
		//nextLine()을 제외한 나머지는 엔터키를 남겨두고 가져오기 
//		때문에 다음 next문에 영향을 줌 ex) nextint()
		System.out.println("Scanner 활용 :"+inputData);
// 		scanner은 문자열로 데이터를 받아온다
		
//		기본 타입, == ( 1==, 1.2==1.3)		
//		문자열 내용 비교.
		
		if(inputData.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}
	}
}
