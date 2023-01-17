package com.yedam.homework17;

import java.util.Scanner;

public class RandomGame {
	private static Scanner sc = new Scanner(System.in);
	private static Keypad game;
	private static int num = (int) (Math.random() * 2) + 1;
	private static boolean running = true;

	private static void run() {
		while (true) {
			System.out.println(
					"===========================================================================================");
			System.out.println(
					"<< 1.LeftUp | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange |9.EXIT >>");
			System.out.println(
					"===========================================================================================");
			System.out.println("choice>>");
			int selectNm = Integer.parseInt(sc.nextLine());
			if (selectNm == 1) {
				game.leftUpButton();
			} else if (selectNm == 2) {
				game.leftDownButton();
			} else if (selectNm == 3) {
				game.rightUpButton();
			} else if (selectNm == 4) {
				game.rightDownButton();
			} else if (selectNm == 5) {
				game.changeMode();
			} else if (selectNm == 0) {
				num = 2;
				break;
			} else if (selectNm == 9) {
				System.out.println("EXIT");
				running = false;
				break;
			} else {
				System.out.println("바른 번호를 입력하시오>>");
			}
		}
	}
	public static void main(String[] args) {
		while (running) {
			if (num == 1) {
				game = new RPGgame();
				run();

			} else if (num == 2) {
				game = new ArcadeGame();
				run();

			}
		}
	}
}
