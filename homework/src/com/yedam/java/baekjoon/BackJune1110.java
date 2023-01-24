package com.yedam.java.baekjoon;

import java.util.Scanner;

public class BackJune1110 {
	public static void main(String[] args) {
		// 0<=int<=99
		System.out.println("입력");
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int e = a;
		int count = 0;
		if (a >= 0 && a <= 100) {
			do {
				e = ((e % 10) * 10) + ((e / 10) + (e % 10)) % 10;
				count++;
			} while (e != a);
			System.out.println(count);
		}
	}
}
