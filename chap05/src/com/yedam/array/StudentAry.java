package com.yedam.array;

import java.util.Scanner;

public class StudentAry {
public static void main(String[] args) {
	//한 학생의 성적을 입력.
	//과목 수 
	int subjectNum=0;
	int[] scores = null;
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	while(run) {
		System.out.println("======================");
		System.out.println("1.과목수 |2.점수입력|3.점수리스트|4.분석|5.종료");
		System.out.println("======================");
		
		int selectNo = Integer.parseInt(sc.nextLine());
		
		if(selectNo==1) {
			System.out.println("과목수 입력>>");
			subjectNum = Integer.parseInt(sc.nextLine());
			scores = new int[subjectNum];
			
		}else if(selectNo==2) {
			System.out.println("과목의 갯수에 맞게 점수 입력");
			for(int i=0; i<scores.length;i++) {
				System.out.println("점수 입력>>");
				scores[i] = Integer.parseInt(sc.nextLine());
			}
		}else if(selectNo==3) {
			for(int i=0; i<scores.length;i++) {
				System.out.println(scores[i]+"점");
			}
		}else if(selectNo==4) {
			//총합, 평균
			int sum = 0;
			int avg = 0;
			for(int i=0; i<scores.length;i++) {
				sum+= scores[i];
			}
			System.out.println("총합은"+sum+","+"평균은"+avg/scores.length);
						
		}else if(selectNo==5) {
			System.out.println("end of prog");
			run =false;
			break;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
}
