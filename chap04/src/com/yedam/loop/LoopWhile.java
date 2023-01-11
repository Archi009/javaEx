package com.yedam.loop;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		// 1~100 사이의 2의 배수 //아래 예시는 for문과 같이 작동
		int i = 1;
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

		// 계산기 프로그램
		// 무한 루프 조건으로 프로그램 실행
		// event(trigger) 프로그램 종료 -> break;
		boolean run = true; // 무한루프의 종료에 필요한 무언가;;
		Scanner sc = new Scanner(System.in);
		while (run) { // while문의 조건이 true면 무한루프가 발생 탈출 문을 따로 만들지 않으면 다음 문장을 실행하지 못한다
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
			System.out.println("입력>");

			int num = Integer.parseInt((sc.nextLine()));

			switch (num) {
			case 1:
				System.out.println("더하고자 하는 두 수 를 입력>");
				System.out.println("1>");
				int num1 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num2 = Integer.parseInt((sc.nextLine()));
				int result = num1 + num2;
				System.out.println((num1 + ", " + num2 + "의 결과" + result));
				break;
			case 2:
				System.out.println("빼고자 하는 두 수 를 입력>");
				System.out.println("1>");
				int num3 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num4 = Integer.parseInt(sc.nextLine());
				int result2 = num3 - num4;
				System.out.println((num3 + ", " + num4 + "의 결과" + result2));
				break;
			case 3:
				System.out.println("곱하고자 하는 두 수 를 입력>");
				System.out.println("1>");
				int num5 = Integer.parseInt(sc.nextLine());
				System.out.println("2>");
				int num6 = Integer.parseInt(sc.nextLine());
				int result3 = num5 * num6;
				System.out.println((num5 + ", " + num6 + "의 결과" + result3));
				break;
			case 4:// while문 종료에 필요한 무언가의 상태(true)를 바꿔주는 방식(=>false)으로 탈출가능!!
				run = false;
				System.out.println("end of prog");
				break;
			default:
				System.out.println("1~4 사이 수를 입력해주세요.");
				break;
			}

		}
		// System.out.println("end of prog");// 위의 문장이 무한 루프일때 탈출문이 없으면 unreachable
		// code오류가 발생

		// 게임 만들기
		// 컴퓨터와 가위, 바위, 보
		// 앞, 뒤 맞추기
		// 한 판에 500원
		//조건에 맞게 코딩을 어떻게 할지 구상
		//어떤 반복문? 어떤 변수? 가위바위보를 어떻게 조건식으로 넣을까
		//for, while, do-wile// 변수 설정 money, menu, //logic(알고리즘)
		int money;
		System.out.println("=====insert coin=====");
		money = Integer.parseInt(sc.nextLine());
		// 10000 -> 20번
		// 1500 -> 3번
		boolean flag = true;
		// money>500 flag
		while (money > 500 && flag) {

			System.out.println((money / 500) + "번의 기회가 남았습니다.");
			System.out.println("1.가위바위보 | 2. 앞 뒤 맞추기 |3. 종료");

			System.out.println("입력>");
			int gameNo = Integer.parseInt(sc.nextLine());

			switch (gameNo) {
			case 1:
				// 컴퓨터와 가위, 바위, 보
				// 컴퓨터가 내는 가위, 바위, 보 => 랜덤 값 추출
				// 입력 한 값이 랑 비교해서 이겼다 , 졌다 , 비겼다.
				// 사용자의 입력값 || String.equals(내용)
				System.out.println("가위, 바위, 보!");
				String RSP = sc.nextLine();
				// 가위 -> 1 바위 -> 2 보 -> 3
				int randomNo = (int) (Math.random() * 3) + 1;

				if (RSP.equals("가위")) {
					// 사용자 : 가위, 컴퓨터 : 1
					if (randomNo == 1) {
						System.out.println("비겼다");
					}
					// 사용자 : 가위, 컴퓨터 : 2
					else if (randomNo == 2) {
						System.out.println("졌다");
					}
					// 사용자 : 가위, 컴퓨터 : 3
					else if (randomNo == 3) {
						System.out.println("이겼다");
					}

				} else if (RSP.equals("바위")) {
					// 사용자 : 바위, 컴퓨터 : 1
					if (randomNo == 1) {
						System.out.println("이겼다");
					}
					// 사용자 : 바위, 컴퓨터 : 2
					else if (randomNo == 2) {
						System.out.println("비겼다");
					}
					// 사용자 : 바위, 컴퓨터 : 3
					else if (randomNo == 3) {
						System.out.println("졌다");
					}

				} else if (RSP.equals("보")) {
					// 사용자 : 보, 컴퓨터 : 1
					if (randomNo == 1) {
						System.out.println("졌다");
					}
					// 사용자 : 보, 컴퓨터 : 2
					else if (randomNo == 2) {
						System.out.println("이겼다");
					}
					// 사용자 : 보, 컴퓨터 : 3
					else if (randomNo == 3) {
						System.out.println("비겼다");
					}

				}
				money -= 500; // money = money - 500
				break;
			case 2:
				// 컴퓨터와 앞, 뒤 맞추기
				System.out.println("앞,뒤!");
				String UB = sc.nextLine();
				int comUB = (int) (Math.random() * 2) + 1;
				if (UB.equals("앞")) {
					// 사용자 : 앞, 컴퓨터 : 1
					if (comUB == 1) {
						System.out.println("맞았다");
					}
					// 사용자 : 앞, 컴퓨터 : 2
					else if (comUB == 2) {
						System.out.println("틀렸다");
					}
				} else if (UB.equals("뒤")) {
					// 사용자 : 뒤, 컴퓨터 : 1
					if (comUB == 1) {
						System.out.println("맞았다");
					}
					// 사용자 : 뒤, 컴퓨터 : 2
					else if (comUB == 2) {
						System.out.println("틀렸다");
					}
				}
				money -= 500; // money = money - 500
				break;
			case 3:
				// 종료.... 1) 투입 금액이 소진되었을때
				// 2) 강제 종료
				flag = false;
				
				break;
			default:
				System.out.println("없는 메뉴 입니다. 다시 입력하세요.");
				break;
			}
			// 잔돈 계산을 위해 500이하로 범위줌
			if (money < 500) {				
				System.out.println(money+"원 남았습니다. 금액이 부족합니다");
			}

		}
		System.out.println("이용감사합니다.^^");

		
		
		
		
		
	}
}
