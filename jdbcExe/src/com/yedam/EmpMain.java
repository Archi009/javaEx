package com.yedam;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmpMain {
	EmpDAO dao = new EmpDAO();
	Scanner scn = new Scanner(System.in);

	public void exe() {

		while (true) {
			System.out.println("1)목록조회 2)단건조회 3)입력 4)급여입력 5)해고 9)종료");
			int menu = scn.nextInt();
			if (menu == 5) {
				// 삭제
				dell();
			} else if (menu == 4) {// 사원번호, 급여 입력. updateEmp (int id, int sal)
				// 수정
				modify();
			} else if (menu == 3) {
				// 입력처리.
				add();
			} else if (menu == 2) {
				// 단건죄회.
				search();
			} else if (menu == 1) {
				// 목록 조회.
				list();
			} else if (menu == 9) {
				// 프로그램 종료.
				break;
			}

		} // end of while()

		System.out.println("end of program.");
	}// end of main

	// 목록 조회
	public void list() { // static 메소드 or 인스턴스 메소드.
//		Map 사용
//		List<Map<String,Object>> result = dao.empList(); //반환유형
//		for(Map<String,Object> map :result) {
//			System.out.println("사원번호 : "+map.get("emp_id")
//			+", 이름: "+map.get("first_name")+"-"+map.get("last_name")
//			+", salary "+map.get("salary"));
//		} 
//		클래스 사용
		List<EmpVO> list = dao.empVoList();
		for (EmpVO emp : list) {
			System.out.println(emp.toString());
		}
	}

	// 단건 조회
	public void search() {
		System.out.println("조회 사원번호 입력>>");
		int id = scn.nextInt();

		// 사용자 입력값을 받아서 처리
		EmpVO emp = dao.getEmp(id);
		if (emp == null) {
			System.out.println("조회된 정보 없음!!");
			return;
		}
		; // 반환 유형 : EmpVO
		System.out.println("결과 : " + emp);

	}

	// 입력 add()
	public void add() {
		System.out.println("사번 입력>>");
		int eid = scn.nextInt();
		scn.nextLine();
		System.out.println("이름>>");
		String name = scn.nextLine();
		System.out.println("이메일>>");
		String email = scn.nextLine();
		System.out.println("입사일자>>");
		String hDate = scn.nextLine();
		System.out.println("직무>>");
		String job = scn.nextLine();

		EmpVO emp = new EmpVO();
		emp.setEmployeeId(eid);
		emp.setFirstName(name);
		emp.setLastName(name);
		emp.setEmail(email);
		emp.setHireDate(hDate);
		emp.setJobId(job);

		if (dao.addEmp(emp) > 0) {
			System.out.println("입력성공!!");
		} else {
			System.out.println("처리중 에러!");
		}

	}

	// 수정 modify
	public void modify() {
		System.out.println("사번 입력>>");
		int eid = scn.nextInt();
		scn.nextLine();
		System.out.println("급여>>");
		int sal = scn.nextInt();
		scn.nextLine();

		if (dao.updateEmp(eid, sal) > 0) {
			System.out.println("수정성공!!");
		} else {
			System.out.println("처리중 에러!");
		}
	}

	// 삭제 del
	public void dell() {
		System.out.println("사번 입력>>");
		int eid = scn.nextInt();
		scn.nextLine();

		if (dao.delEmp(eid) > 0) {
			System.out.println("삭제성공!!");
		} else {
			System.out.println("처리중 에러!");
		}
	}
}// end of class
