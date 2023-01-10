package com.yedam.operator;

public class Operator {
 public static void main(String[] args) {
	//++num, num++
	 int num = 0;
	 System.out.println(num++); //0  num = num +1 실행문 실행 후 
	 //println 을 실행 후 +1을 해줌 
	 System.out.println(++num); //2  num = num +1 실행문 실행 전 
	 //println 이 실행 전 +를 해줌
	 
	 //num==2
	 System.out.println(num--); //2  num = num -1 실행문 실행 후 
	 //num ==1
	 System.out.println(--num); //0  num = num -1 실행문 실행 전 
	 
	 //논리 부정 연산자 ! = not
	 boolean play = true;
	 
	 System.out.println(play); //true
	 
	 play = !play;
	 
	 System.out.println(play); //false
	 
	 
	 //비교 연산자 : true, false
	 int num1 = 10;
	 int num2 = 10;
	 
	 boolean result1 = (num1 == num2); // true
	 boolean result2 = (num1 != num2); // false
	 boolean result3 = (num1 <= num2); // true 
	 System.out.println(result1);
	 System.out.println(result2);
	 System.out.println(result3);
	 
	 char char1 = 'A'; //65
	 char char2 = 'B'; //66
	 
	 boolean result4 = (char1 < char2); // true
	 System.out.println(result4);
	 
	 //논리 연산자
	 //&&,||,!
	  
	 char charCode = 'A'; //65
	 //A 보다 크고 Z보다 작다
	 if(charCode<=65 && charCode<=90) {
		 System.out.println("대문자 입니다.");
	 }
	 
	 if(charCode >= 97 && charCode <=122) {
		 System.out.println("소문자입니다.");
	 }
	 // '0' = 48, '9' = 57
	 // 50< +not(!) => (>=50)
	 // 50 초과의 부정은  50 이하
	 //<=50 +not(!) => >50
	 if(!(charCode<48)&& !(charCode>57)) {
		 //charCode >= 48 && charCode <= 57
		 System.out.println("숫자입니다.");
	 }
	 
	 //복합 대입 연산자  //자신에게 연산할때 자주 사용
	 int result = 0;
	 
	 result += 10; // result = result +10;
	 System.out.println("rsult +=" + result); //result == 10
	 result -= 5; //result - result -5;
	 System.out.println("result -="+result); //result == 5
	 result *= 5;
	 result /=5;
	 
	 
	 //삼항 연산자
	 int score = 80;
	  
	 char grade = score >= 80 ? 'B' : 'C';
	 System.out.println(grade);
	 
	 
		 
	 
	 
	 
}
}
