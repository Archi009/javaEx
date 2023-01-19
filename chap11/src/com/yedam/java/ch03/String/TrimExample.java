package com.yedam.java.ch03.String;

public class TrimExample {
	public static void main(String[] args) {
		String data1 = "                      1234";
		String data2 = "       1234       57762      ";
		String data3 = "1234        57762   ";

		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println();
		
		System.out.println(data1.trim());
		System.out.println(data2.trim());
		System.out.println(data3.trim());
	
	
	}
	
	
	
	
}
