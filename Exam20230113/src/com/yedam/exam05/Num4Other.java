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
				while (true) {
					int random = (int) (Math.random() * size) + 1;
					dice[random-1]++;
					if(random ==5) break;
				}

			} else if (selectNo == 3) {

			} else if (selectNo == 4) {

			} else if (selectNo == 5) {

			}
			

		}
	}
}
