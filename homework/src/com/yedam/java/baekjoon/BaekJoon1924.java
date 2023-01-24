package com.yedam.java.baekjoon;

import java.util.Scanner;

public class BaekJoon1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int day = sc.nextInt();
		int[] countMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] month = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		for (int i = 0; i < m; i++) {
			day += countMonth[i];
		}
		day %= 7;
		System.out.println(month[day]);

	}
}
