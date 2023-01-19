package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("iBATIS");
		set.add("Java");
				
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		//중복된 Java 값이 들어가지 않아 객 체 수는 5개
		System.out.println();
		
		Iterator<String> iterator = set.iterator();
		//hasNext 다음값이 있을때 true 출력
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}//순서가 없기 때문에 출력시에도 순서 없이 막 출력된다.
		
		
		
		
	}
}
