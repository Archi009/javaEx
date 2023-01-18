package com.yedam.java.ch03.String;

public class DataUpdateExample {
	public static void main(String[] args) {
		//replace 를 사용하거나 변수를 바꾸는 식으로 내부의 값을 바꾸면 
//		변수로 연결 되지 않은 객체를 계속 해서 만든다
		String oldStr = "자바는 객체 지향 언어입니다. 자바는풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
//		따라서 빈번한 수정을 할때는 아래 클래스를 이용하는게 좋다.
		StringBuilder sb = new StringBuilder();
		
		sb.append("JAVA ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "24");
		System.out.println(sb.toString());
		
		sb.replace(7, 14, "Book");
		System.out.println(sb.toString());
		
		String result = sb.toString();
		sb.delete(0, 4);
		System.out.println(result);
		System.out.println(sb.toString());
		
	}
}
