package com.yedam.variable;

public class Variable03 {
	public static void main(String[] args) {
		
		int var1 = 0b1011; //2진ㄴㅅ 
		int var2 = 0206;   //8진수
		int var3 = 365;    //10진수
		int var4 = 0xB3;    //16진수
		
		System.out.println("var1 :" + var1);
		System.out.println("var2 :" + var2);
		System.out.println("var3 :" + var3);
		System.out.println("var4 :" + var4);
		
		byte bVar1 = 125;  //-128 ~ 127 <- 200을 담을 수 없다
		//byte bVar2 = 200;
		int bVar2 = 200;
		
		System.out.println("bVar1 :" + bVar1);
		System.out.println("bVar2 :" + bVar2);
		
		//Long
		//int 범위를 넘어 갈 때 사용하는데, 뒤에 꼬리 표를 더 붙여야 한다
		
		long lVar1 = 2000000;      // int범위 내에서 long선언은 그냥 되지만
		long lVar2 = 20000000000L; // int범위 밖의 long 선언에는 끝에 L을 붙여야 한다
		
		
		//Char
		char c1 = 'A';
		char c2	= 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		
	}
}
