package com.yedam.exam05;

import java.util.Scanner;

public class Num4Other {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dice = null;
		int size = 0;

		boolean run = true;
		while (true) {
			System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장많이 나온 수 5. 종료===");
			System.out.println("메뉴");
			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.println("주사위 크기>");
				size = sc.nextInt();
				if (size < 5 || size > 10) {
					size = 0;
					System.out.println("입력한 값이 범위를 벗어났습니다.");
					System.out.println("5~10사이의 수를 입력해주세요");
				}
				dice = new int[size];

			} else if (selectNo == 2) {
				int count = 0;
				while (true) {
					int random = (int) (Math.random() * size) + 1;
					dice[random - 1]++;
					count++;
					if (random == 5)
						break;
				}
				System.out.println("5가 나올 대까지 주사위를 " + count + "번 굴렷습니다.");
			} else if (selectNo == 3) {
				for (int i = 0; i < dice.length; i++) {
					System.out.printf("%d은 %d번 나왔습니다.\n", (i + 1), dice[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				for (int num : dice) {
					if (max < num) {
						max = num;
					}
				}
				int i = 0;
				for (; i < dice.length; i++) {
					if (dice[i] == max)
						break;
				}
				System.out.println("가장 많이 나온 수는 " + (i + 1) + "입니다.");
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
				break;
			}

		}
		sc.close();
	}
}
