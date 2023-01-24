package com.yedam.java.baekjoon;

import java.util.Scanner;

public class baekjoon2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = sc.nextLine().split(" ");
		int h = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
			if (m - 45 < 0) {
				h -= 1;
				if (h < 0)
					h = 23;
				m = 60 + (m - 45);

			} else {
				m = m - 45;
			}
			System.out.println(h + " " + m);
		}
	}
}