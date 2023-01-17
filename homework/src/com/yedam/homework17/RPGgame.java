package com.yedam.homework17;

public class RPGgame implements Keypad {
	// 필드
	private int mode;

	// 생성자
	RPGgame() {
		mode = NORMAL_MODE;
		System.out.println("RPGgame 실행");
	}

	// 메소드
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");

	}

	@Override
	public void rightUpButton() {
		if (mode == NORMAL_MODE) {
			System.out.println("캐릭터가 한 칸 단위로 점프한다.");
		} else {
			System.out.println("캐릭터가 두 칸 단위로 점프한다.");

		}
	}

	@Override
	public void rightDownButton() {
		if (mode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격.");
		} else {
			System.out.println("캐릭터가 HIT 공격.");

		}

	}

	@Override
	public void changeMode() {
		if (mode == NORMAL_MODE) {
			mode = HARD_MODE;
			System.out.println("HARDE MODE 입니다.");
		} else {
			mode = NORMAL_MODE;
			System.out.println("NORMAL MODE 입니다.");
		}
	}

}
