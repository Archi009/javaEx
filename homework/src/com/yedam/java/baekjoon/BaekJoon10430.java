package com.yedam.java.baekjoon;

import java.util.Scanner;

public class BaekJoon10430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a >= 2 && a <= 10000 && b >= 2 && b <= 10000 && c >= 2 && c <= 10000) {
			System.out.println((a + b) % c);
			System.out.println(((a % c) + (b % c)) % c);
			System.out.println((a * b) % c);
			System.out.println(((a % c) * (b % c)) % c);
		}
	}
}
