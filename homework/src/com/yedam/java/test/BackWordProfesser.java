package com.yedam.java.test;

import java.util.Scanner;

public class BackWordProfesser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.문자열 뒤집기
		System.out.println("뒤집을 문자열 입력>");
		String str = sc.nextLine();
		//String.length ->문자열 길이
		//String.charAt(위치) -> 위치에 따른 문자 출력
		for(int i = str.length()-1;i>0;i--) {
			System.out.println(str.charAt(i));
		}
	}
}
