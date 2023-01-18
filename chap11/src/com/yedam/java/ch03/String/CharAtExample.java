package com.yedam.java.ch03.String;

public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "020529-4685927";
		char gender = ssn.charAt(7);
		switch (gender)	{
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
	}
}
