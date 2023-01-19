package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {		
	
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2," Database");
		list.add("iBATIS");
		list.add("Java");
		
		//  0 : Java, 1 : JDBC, 2 : Database,3 : Servlet/JSP, 4 : iBATIS, 5 : Java
		
		int size = list.size();
		System.out.println("총 객체수 : "+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println();
		
		//list[index] -> list.get(index)
		for(int i = 0; i <list.size();i++) {
			System.out.printf("%d :%s |n ", i, list.get(i));
		}
		System.out.println();
		
		list.remove(2); //Database
		list.remove(2); //Servlet/JSP
		list.remove("Java");
		for(String data : list) {
			System.out.println(data);
			
		}
		
		
		
	}
}
