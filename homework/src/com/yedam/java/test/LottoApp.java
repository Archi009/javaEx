package com.yedam.java.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp extends Lotto2 {
	// List 활용한 Lotto
	// 1. 중복되지 않은 번호 6개
	// 2. 입력한 금액에 따라 한 장당 1~5줄 생성
	// 3. 한 줄당 천원, 입력한 금액 만큼 생성
	// 4, 수매 금액, 생성된 번호 출력 기능
	// 5. 5장씩 끊어서 출력 할 것.
	Scanner sc = new Scanner(System.in);
	private List<int[]> list = new ArrayList<>();
	// list -> {1,2,3,4}

	public LottoApp() {
		run();
	}

	private void run() {

		System.out.println("===1.로또 생성 2.로또 조회  99.종료===");
		int menu = 0;
		while (menu != 99) {
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				// 로또 생성
				makeLotto();
				break;
			case 2:
				// 로또 조회(내가 투입한 금액과 출력 번호)
				showInfo();
				break;
			case 99:
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

	private void showInfo() {
		System.out.println("투입한 돈 : " + (list.size() * 1000)+"원");
		for (int i = 0; i < list.size(); i++) {
			System.out.print((i%5+1)+"번"); 
			
			for (int j : list.get(i)) {
				
				System.out.print(j+" ");
			}
			
			System.out.println();
			
			if((i+1)!= 0 && (i+1) % 5 == 0) {
				System.out.println("==========================");
			}
		}

	}

	private void makeLotto() {
		System.out.println("돈");
		int money = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < money / 1000; i++) {
			// list에 int형 배열이 객체로 들어간다.
			list.add(makeNumber());
		}
		System.out.println("번호 출력 완료");
	}

	private int[] makeNumber() {
		int[] lottoNo = new int[6];
		// 랜덤 배열 뽑기
		for (int i = 0; i < 6; i++) {
			lottoNo[i] = (int) (Math.random() * 45) + 1;
			// 인덱스가 0일때 중복 체크 할 필요가 없다.
			if (i > 0) {
				// 인덱스가 1이상일 때 중복 체크
				for (int j = 0; j < i; j++) {
					// 방금 생성한 랜덤값과 내가 가지고 있는 값과 같으면..
					if (lottoNo[j] == lottoNo[i]) {
						// 다시 i 값 -1 (다시 랜덤값 생성)
						i -= 1;
						break;
					}
				}
			}
		}
		return lottoNo;
	}
}
