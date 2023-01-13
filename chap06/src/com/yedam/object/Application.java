package com.yedam.object;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		// 클래스 생성해서 객체 만든 다음 객체 바로 사용.
		// 객체를 한 곳에 모아서 관리 하는 형태
		// 배열
		// int[] ary - new int[];
		// Student[] stdAry = new Student[10];

		// 학생 정보 보관 배열
		Student[] stdAry = null;

		int stdNum = 0;
		Scanner sc = new Scanner(System.in);
		// while문을 활용해서 학생 관리 프로그램 작성.
		while (true) {
			System.out.println("======================");
			System.out.println("1.학생 수|2.정보입력|3.정보확인|4.총합,평균|5.종료");
			System.out.println("======================");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				// Student 클래스로 만들어지는 객체를 몇개나 배열에 넣을지
				// 에 대한 값을 받아옴.
				System.out.println("학생수 입력>>");
				stdNum = Integer.parseInt(sc.nextLine());

			} else if (selectNo == 2) {
				// 정보 입력
				stdAry = new Student[stdNum];
				for (int i = 0; i < stdAry.length; i++) {
					// 객체 배열에 각 인덱스에 존재하는 Student 객체에게
					// 데이터를 제공하기 위해서 임시 객체를 만듦.
//				Student std = new Student();
//				std.name = "이름";
//				std.age = 10;
//				stdAry[i]=std;

					stdAry[i] = new Student();
					// 객체의 refer값이 없기 때문에
					// 각배열 안의 객체들에게 new연산자를 통해 refer값을 부여한다
					System.out.println("이름>");
					stdAry[i].name = sc.nextLine();
					System.out.println("나이>");
					stdAry[i].age = Integer.parseInt(sc.nextLine());
					System.out.println("학교이름>");
					stdAry[i].schoolName = sc.nextLine();

					// 성적 입력
					System.out.println("국어 점수>");
					stdAry[i].kor = Integer.parseInt(sc.nextLine());
					System.out.println("수학 점수>");
					stdAry[i].math = Integer.parseInt(sc.nextLine());
					System.out.println("영어 점수>");
					stdAry[i].eng = Integer.parseInt(sc.nextLine());
					// stdAry[i].name = "김또치";

				}

			} else if (selectNo == 3) {
				// 정보 확인
				for (Student std : stdAry) {
					std.getInfo();

				}
			} else if (selectNo == 4) {
				// 총합, 평균
				int total = 0;
				double avg = 0;
				System.out.println("전체 학생 총합/평균 조회");
				for (int i = 0; i < stdAry.length; i++) {
					total = stdAry[i].kor + stdAry[i].math + stdAry[i].eng;
					avg = total / 3.0;
					System.out.println(stdAry[i].name + "학생>");
					System.out.println("총합:" + total + "평균:" + avg);

				}
				// 시험 젤 잘 친 과목, 못 친 과목 확인
				int max = 0;
				int min = 0;
				for (int i = 0; i < stdAry.length; i++) {
					//비교 기준값을 정해줌(kor을 기준으로)
					max = stdAry[i].kor;
					min = stdAry[i].kor;
					//최댓값
					//기준값 외 의 값을(eng와 math) 서로 비교
					if (stdAry[i].eng < stdAry[i].math) {
						//기준값과 math값 비교
						if (max < stdAry[i].math) {
							max = stdAry[i].math;
						}
						//기준값과 eng비교
					} else if (max < stdAry[i].eng) {
						max = stdAry[i].eng;
					}
					//최솟값
					if (stdAry[i].eng > stdAry[i].math) {
						if (min > stdAry[i].math) {
							min = stdAry[i].math;
						}
					} else if (min > stdAry[i].eng) {
						min = stdAry[i].eng;
					}
					System.out.println(stdAry[i].name + "최고성적 :" + max + "최저성적 :" + min);

				}

			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}

		Student s1 = new Student();

		Student s2 = new Student();

		System.out.println(s1);
		System.out.println(s2);

		// dot 연산자
		// s1.age = 20; //dot 연산자를 통해 나이
		// s1.name = "yedam"; //이름
		// s1.schoolName = "예담 대학"; //학교이름의 정보를 s1에 담았다
		System.out.println("==================");
		System.out.println("s1의 정보 ");
		s1.getInfo(); // Student Class의 함수 getInfo를 실행
		// 만약 Student Class 에 없는
		// 속성(testScore)을 넣으려고 해도 함수(lastName())같은것을 실행하려해도
		// 애초에 Student 설계도에 없어서 사용 불가.
		System.out.println("==================");
		System.out.println("s2의 정보 ");
		s2.age = 30;
		s2.name = "대예담";
		s2.schoolName = "예담 대학원";
		s2.getInfo();

		s1.age = 20;
		s1.name = "대학생";
		System.out.println("=========================== ");
		System.out.println("문서에서 수정된 s1의 정보 ");
		System.out.println("학생의 나이 : " + s1.age);
		System.out.println("학생의 이름 : " + s1.name);
		System.out.println("재학중인 학교 : " + s1.schoolName);

		Korean k1 = new Korean("fork", "02003040");

		System.out.println("이름 : " + k1.name);
		System.out.println("주민번호 : " + k1.ssn);

	}
}
