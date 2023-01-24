package com.yedam.java.baekjoon;

import java.util.Scanner;

public class Baekjoon1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		String[] str = sc.nextLine().split(" ");
//		int a = Integer.parseInt(str[0]);
//		int b = Integer.parseInt(str[1]);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a >= -10000 && a <= 10000 && b >= -10000 && b <= 10000) {
			if (a > b) {
				System.out.println(">");
			} else if (a < b) {
				System.out.println("<");
			} else if (a == b) {
				System.out.println("==");
			}
		}
	}
}
