package com.yedam.variable;

public class Variable01 {
	public static void main(String[] args) {
		
		int hour = 3;
		
		int minute = 5;
		
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		
		System.out.println("총" + totalMinute + "분");
		
		//변수 초기화 하지 않았을 때
		
		int value;
		value = 3; // 주석처리 해서 확인!
		int result = value + 10;
		
		System.out.println(result);
		
		//변수의 복사
		int x = 3;
		int y = 5;
		// x -> y의 값으로 변경
		// y -> x의 값으로 변경
		
		//if.  y = x;
		//x = x, y = x;
		
		//대신 답아줄수 있는 변수를 사용;
		int z = 0;
		// x 의 데이터를 미리 z에 담아 두고 ,
		//1)x -> z (z=3)
		//2)y -> x (x=5)
		//3)z -> y (y=3)
		
		z = x; //1)x -> z (z=3)
		x = y; //2)y -> x (x=5)
		y = z; //3)z -> y (y=3)
		
	}
}
