package com.yedam.java.baekjoon;

import java.util.Scanner;

public class BaekJoon2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nowTime = sc.nextLine().split(" ");
		int h = Integer.parseInt(nowTime[0]);
		int m = Integer.parseInt(nowTime[1]);
		int takeM = Integer.parseInt(sc.nextLine());
		int totalM = (60 * h) + m + takeM;

		h = totalM / 60;
		m = totalM % 60;

		if (h > 23)
			h = h % 24;
		System.out.println(h + " " + m);
	}
}
