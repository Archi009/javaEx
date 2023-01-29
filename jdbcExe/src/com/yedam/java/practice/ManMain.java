package com.yedam.java.practice;

import java.util.List;
import java.util.Scanner;

import com.yedam.EmpVO;

public class ManMain {
	public static void main(String[] args) {
		Managing ma = new Managing();
		Custumer co = new Custumer();
		Login lo = new Login();
		Scanner sc = new Scanner(System.in);
		String id = null;
		int selNum = 0;
		String name = null;
		String uId = null;
		String ps = null;
		String ad = null;
		String ph = null;
		String cl = null;
		String gr = null;
//		System.out.println("=====수영장 관리 프로 그램====");
//		System.out.println();
//		System.out.println("==1)로그인 | | 2)회원가입 ==");
//		selNum = sc.nextInt();
//		while (true) {
//		if(selNum == 1) {
//			System.out.println("로그인");
//			System.out.println("아이디 입력>>");
//			uId = sc.next();
//			ManVO emp = lo.getId(uId);
//			if (emp == null) {
//				System.out.println("존재하지 않는 아이디입니다.");
//				return;
//			}
//			System.out.println("비밀번호 입력>>");
//			ps= sc.next();
//			ManVO emp1 = lo.getPs(ps);
//			if (emp1 == null) {
//				System.out.println("유효한 비밀 번호를 입력하세요");
//				return;
//			}
//			if(emp1.equals(ps)) {
//				id = uId;
//				System.out.println("로그인 성공");	
//				break;
//			}
//		}else if(selNum==2) {	
//			//회원가입
//			System.out.println("아이디 입력>>");
//			uId = sc.next();
//			System.out.println("아이디 중복 검사");
//			ManVO emp = lo.getId(uId);
//			//아이디 중복 검사
//			if (emp == null) {
//				System.out.println("사용가능한 아이디 입니다.");
//				
//			
//			}else {
//					System.out.println("중복된 아이디");	
//					continue;
//				}
//			
//			System.out.println("비밀번호 입력>>");
//			ps=sc.next();
//			System.out.println("이름 입력>>");
//			name = sc.next();
//			System.out.println("주소 입력>>");
//			ad = sc.next();
//			System.out.println("연락처 입력>>");
//			ph = sc.next();
//			
//			ManVO emp1 = new ManVO();
//			emp1.setUserId(uId);
//			emp1.setUserPs(name);
//			emp1.setUserNm(name);
//			emp1.setUserAd(ad);
//			emp1.setUserPh(ph);
//
//			if (lo.addLo(emp1) > 0) {
//				System.out.println("회원가입!!");
//			} else {
//				System.out.println("처리중 에러!");
//			}
//			
//		}
//		}
//	
//		id = "관리자";
		id = "고객";
		if (id=="관리자") {
			while (true) {
				// 관리자
				System.out.println("========================================================================================");
				System.out.println("==| 1.전체 회원 조회 | 2.단일 회원 조회| 3.회원 등급 작성 | 4.수업 등록/삭제 | 5.회원 삭제 | 6.로그아웃==");
				System.out.println("========================================================================================");
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
					//회원 등급 입력
					System.out.println("회원명 입력");
					name = sc.next();
					System.out.println("등록/수정 할 등급 선택");
					System.out.println("1)선수 || 2)일반 || 3)초보");
					selNum = sc.nextInt();
					if(selNum == 1) {
						cl = "선수";						
					}else if(selNum == 2) {
						cl = "일반";						
					}else if(selNum == 3) {
						cl = "초보";						
					}						
					if (ma.updateCl(name, cl) > 0) {
						System.out.println(name + "님" + cl + "등급 설정");
					} else {
						System.out.println("처리중 에러!");
					}

				} else if (selNum == 4) {
					// 수업 등록/ 삭제
					System.out.println("회원명 입력");
					name = sc.next();
					System.out.println("1.수업 등록/수정 || 3.삭제");
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
				System.out.println("================================================================================================");
				System.out.println("==| 1.전체 회원 조회 | 2.내 정보 조회 | 3.반 별 조회 | 5.등급 신청 | 6.수업 등록/취소 | 7.회원 탈퇴 | 8.로그아웃==");
				System.out.println("================================================================================================");
				selNum = sc.nextInt();

				if (selNum == 1) {
					// 전체 회원 조회
					List<ManVO> list = co.manVoListForCt();
					for (ManVO emp : list) {
						System.out.println(emp.toStringCuSearch());
					}

				} else if (selNum == 2) {
						//내 정보 조회
						System.out.println("조회 할 회원 입력>>");
						name = sc.next();
						ManVO emp = co.getSelfForCt(name);
						if (emp == null) {
							System.out.println("조회된 정보 없음!!");
							return;
						}
						System.out.println(name + emp.toStringCuSelfSearch());
					

				}else if (selNum == 3) {
					//반별 조회
					System.out.println("1.자유형||2.배영||3.평영||4.접영");
					if(sc.nextInt()==1) {
						gr = "자유형";						
					}else if(sc.nextInt()==1) {
						gr = "배영";						
					}else if(sc.nextInt()==1) {
						gr = "평영";						
					}else if(sc.nextInt()==1) {
						gr = "접영";						
					}else {
						System.out.println("유효한 값이 아닙니다.");
						}
					
					List<ManVO> list = co.getManForCt(gr);
					for (ManVO emp : list) {
						System.out.println(emp.toStringCuSelfSearch());
					}
				} else if (selNum == 4) {
					System.out.println("조회 할 반 입력");
					name = sc.next();
					System.out.println("등록/수정 할 수업 입력");
					cl = sc.next();
					if (co.updateClForCt(name, cl) > 0) {
						System.out.println(name + "님" + cl + "등급 설정");
					} else {
						System.out.println("처리중 에러!");
					}

				} else if (selNum == 5) {
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

				} else if (selNum == 7) {
					// 회원 탈퇴
					System.out.println("삭제 할 회원명 입력>>");
					name = sc.next();
					System.out.println("비밀 번호 입력>>");
					ps = sc.next();
					ManVO emp = co.getPsForCt(name);
					if (emp == null) {
						System.out.println("잘못 된 비밀번호!");
						return;
					}
					uId = id;
					if(emp.equals(ps)) {
					if (co.delManForCt(name, uId) > 0) {
						System.out.println("탈퇴 성공!!");
					} else {
						System.out.println("처리중 에러");
					}
					}

				} else if (selNum == 8) {
					//로그아웃
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
