package homework;

import java.util.Scanner;

public class homework202301010 {
	public static void main(String[] args) {

		// 문제 1
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 문제 x값을 입력하시오>>");
		int x = Integer.parseInt((sc.nextLine()));
		System.out.println("y값을 입력하시오>>");
		int y = Integer.parseInt((sc.nextLine()));

		if (x > 0 && y > 0) {
			System.out.println("제 1사 분면입니다.");
		} else if (x < 0 && y > 0) {
			System.out.println("제 2사 분면입니다.");
		} else if (x < 0 && y < 0) {
			System.out.println("제 3사 분면입니다.");
		} else {
			System.out.println("제 4사 분면입니다.");
		}

		// 문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		// 윤년은 연도가 4의 배수이면서 100의 배수가 아닐 때 또는 400의 배수일때입니다.
		// 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이며,
		// 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아닙니다.
		// HiNT : 이중 IF문 사용
		// 문제출처, 백준(https://www.acmicpc.net/) 2753번 문제
		System.out.println("2번 문제 년도를 입력하세요");
		int year = Integer.parseInt((sc.nextLine()));
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}

		// 문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		// 구현하세요.
		// 예를 들어, 가위가 주어졌을 때 "이기기 위해선 바위를 내야합니다." 라고 출력하도록 하세요.
		// 한 단어를 입력받을 경우 Scanner객체의 next() 함수를 사용하면 됩니다.
		System.out.println(" 3번 문제 가위바위보!>>");
		String rps = sc.nextLine();
		switch (rps) {
		case "바위":
			System.out.println("이기기위해선 보를 내야 합니다.");
			break;
		case "가위":
			System.out.println("이기기위해선 바위를 내야 합니다.");
			break;
		case "보":
			System.out.println("이기기위해선 가위를 내야 합니다.");
			break;
		default:
			System.out.println("가위, 바위, 보 중 하나를 내야 합니다.");
		}

		// 문제4) for문과 "*"를 이용하여 아래와 같이 출력하도록 하세요.
		// * 1번째 줄 5번째 별 하나
		// ** 2번째 줄 4번째 별 둘
		// *** 3번째 줄 3번째 별 셋
		// **** 4번째 줄 2번째 별 넷
		// ***** 5번재 줄 1번째 별 다섯
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else if (j <= i) {
					System.out.print("*");
				}
			}
			System.out.println();

		}

		// 문제5) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		// 예를 들어 2와 3을 입력받았을 경우 아래처럼 출력합니다.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6
		System.out.println("원하는 구구단을 입력하시오>>");
		int m = Integer.parseInt((sc.nextLine()));
		System.out.println("원하는 범위를 입력하시오.>>");
		int n = Integer.parseInt((sc.nextLine()));

//	 
		for (int j = 1; j <= n; j++) {
			System.out.println(m + "x" + j + "=" + (m * j) + "\n");
		}
//		 System.out.println();
//	 }
	}
}
