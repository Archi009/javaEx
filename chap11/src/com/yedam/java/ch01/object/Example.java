package com.yedam.java.ch01.object;

import java.util.HashMap;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동");
		Member m2 = new Member("신윤권");
		Member m3 = new Member("신윤권");
		
		if(m1.equals(m2)) {
			System.out.println("m1 과 m2는 동등합니다.");
		}else {
			System.out.println("m1 과 m2는 동등하지 않습니다.");		
		}
		if(m2.equals(m3) ) {
			System.out.println("m2 과 m3는 동등합니다.");
		}else {
			System.out.println("m2 과 m3는 동등하지 않습니다.");		
		}
		
		Map<Key, String> hashMap = new HashMap<Key, String>();
		//Key => 구별 가능한 클래스 equals(),hashCode() 를 오버라이딩
		hashMap.put(new Key(1), "홍길동");
		
		
		String name = hashMap.get(new Key(1));
		System.out.println(name);
		
		System.out.println();
		
		String message = " 오늘은 수요일입니다.";
		System.out.println(message);
		System.out.println(m1);
		
		
		
		
	}
}
