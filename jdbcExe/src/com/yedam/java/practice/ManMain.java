package com.yedam.java.practice;

import java.util.List;
import java.util.Scanner;

public class ManMain {
	public static void main(String[] args) {
		Managing ma = new Managing();
		Custumer co = new Custumer();
		Scanner sc = new Scanner(System.in);
		String id = null;
		int selNum = 0;
		String name = null;
		String uId = null;
		String cl = null;
		String gr = null;
//		System.out.println("==1)로그인 | | 2)회원가입 ==");
//		selNum = sc.nextInt();
//		switch (selNum) {
//		case 1:
//			System.out.println("로그인");
//			System.out.println("아이디 입력>>");
//			
//			System.out.println("비밀번호 입력>>");
//			
//			break;
//		case 2:
//
//			break;
//
//		default:
//			break;
//		}
		id = "관리자";
//		id = "고객";
		if (id=="관리자") {
			while (true) {
				// 관리자
				System.out.println(
						"=======================================================================================");
				System.out.println("==| 1.전체 회원 조회 | 2.단일 회원 조회| 3.회원 등급 작성 | 4.수업 등록/삭제 | 5.회원 삭제 | 6.로그아웃");
				System.out.println(
						"=======================================================================================");
				selNum = sc.nextInt();

				if (selNum == 1) {
					// 전체 회원 조회
					List<ManVO> list = ma.manVoList();
					for (ManVO emp : list) {
						System.out.println(emp.toString(0));
					}

				} else if (selNum == 2) {
					// 단일 회원 조회
					System.out.println("조회 할 회원 입력>>");
					name = sc.next();
					ManVO emp = ma.getMan(name);
					if (emp == null) {
						System.out.println("조회된 정보 없음!!");
						return;
					}
					System.out.println(name + emp.toStringManagerSearch());

				} else if (selNum == 3) {
					System.out.println("회원명 입력");
					name = sc.next();
					System.out.println("등록/수정 할 수업 입력");
					cl = sc.next();
					if (ma.updateCl(name, cl) > 0) {
						System.out.println(name + "님" + cl + "등급 설정");
					} else {
						System.out.println("처리중 에러!");
					}

				} else if (selNum == 4) {
					// 수업 등록/ 삭제
					System.out.println("회원명 입력");
					name = sc.next();
					System.out.println("1.등록/수정 || 2.삭제");
					selNum = sc.nextInt();
					if (selNum == 1) {
						System.out.println("등록/수정 할 수업 입력");
						gr = sc.next();
						if (ma.updateGr(name, gr) > 0) {
							System.out.println(name + "님" + gr + "수업 등록/수정");
						} else {
							System.out.println("처리중 에러!");
						}
					} else if (selNum == 2) {
						if (ma.delGr(name) > 0) {
							System.out.println(name + "님 수업 삭제");
						} else {
							System.out.println("처리중 에러");
						}

					}

				} else if (selNum == 5) {
					// 회원 삭제
					System.out.println("삭제 할 회원명 입력>>");
					name = sc.next();
					System.out.println("삭제 할 회원 아이디 입력>>");
					uId = sc.next();
					if (ma.delMan(name, uId) > 0) {
						System.out.println("삭제 성공!!");
					} else {
						System.out.println("처리중 에러");
					}

				} else if (selNum == 6) {
					id = null;
					System.out.println("로그아웃");
					break;
				}

			}
			
			
			
			
			
			
			
		} else if (id!="관리자") {
			while (true) {
				// 고객
				System.out.println(
						"=======================================================================================");
				System.out.println("==| 1.전체 회원 조회 | 2.단일 회원 조회| 3.회원 등급 작성 | 4.수업 등록/삭제 | 5.회원 삭제 | 6.로그아웃");
				System.out.println(
						"=======================================================================================");
				selNum = sc.nextInt();

				if (selNum == 1) {
					// 전체 회원 조회
					List<ManVO> list = co.manVoListForCt();
					for (ManVO emp : list) {
						System.out.println(emp.toString(0));
					}

				} else if (selNum == 2) {
					// 단일 회원 조회
					System.out.println("조회 할 회원 입력>>");
					name = sc.next();
					ManVO emp = co.getManForCt(name);
					if (emp == null) {
						System.out.println("조회된 정보 없음!!");
						return;
					}
					System.out.println(name + emp.toStringManagerSearch());

				} else if (selNum == 3) {
					System.out.println("회원명 입력");
					name = sc.next();
					System.out.println("등록/수정 할 수업 입력");
					cl = sc.next();
					if (co.updateClForCt(name, cl) > 0) {
						System.out.println(name + "님" + cl + "등급 설정");
					} else {
						System.out.println("처리중 에러!");
					}

				} else if (selNum == 4) {
					// 수업 등록/ 삭제
					System.out.println("회원명 입력");
					name = sc.next();
					System.out.println("1.등록/수정 || 2.삭제");
					selNum = sc.nextInt();
					if (selNum == 1) {
						System.out.println("등록/수정 할 수업 입력");
						gr = sc.next();
						if (co.updateGrForCt(name, gr) > 0) {
							System.out.println(name + "님" + gr + "수업 등록/수정");
						} else {
							System.out.println("처리중 에러!");
						}
					} else if (selNum == 2) {
						if (co.delGrForCt(name) > 0) {
							System.out.println(name + "님 수업 삭제");
						} else {
							System.out.println("처리중 에러");
						}

					}

				} else if (selNum == 5) {
					// 회원 삭제
					System.out.println("삭제 할 회원명 입력>>");
					name = sc.next();
					System.out.println("삭제 할 회원 아이디 입력>>");
					uId = sc.next();
					if (co.delManForCt(name, uId) > 0) {
						System.out.println("삭제 성공!!");
					} else {
						System.out.println("처리중 에러");
					}

				} else if (selNum == 6) {
					id = null;
					System.out.println("로그아웃");
					break;
				}

			}
//			
//			
//			
//			
//		}

		}
	}
}
