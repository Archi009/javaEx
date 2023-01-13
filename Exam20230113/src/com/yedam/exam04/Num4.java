package com.yedam.exam04;

import java.util.Scanner;

public class Num4 {
public static void main(String[] args) {
	int[] dicNm = null;
	int dicMass = 0;
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("메뉴를 선택하시오");
		System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장많이 나온 수 5. 종료===");		
		int selectNm = Integer.parseInt(sc.nextLine());
		if(selectNm==1) {
			System.out.println("주사위 크기를 정하시오");	
			int test = Integer.parseInt(sc.nextLine());
			if(test<5||test>10) {
				System.out.println("주사위크기는 5~10 입니다. 다시 처음부터 다시 설정하세요");
			}dicMass = test;
		}else if(selectNm==2) {
			int no = 0;
			int count = 0;
			dicNm = new int[dicMass];
			/*while(no!=5){
					no = (int) (Math.random()*dicMass)+1;
					count++;
					dicNm[no-1]++;					
		}*/
			Label:for(int i = 0 ; i < dicMass;i++) {
				no = (int) (Math.random()*dicMass) + 1;
				if(no==5) {
					count++;
					dicNm[no-1]++;
					break Label;
				}else {
					count++;
					dicNm[no-1]++;		
				}
			}System.out.println("5가 나올때 까지 "+count+"번 굴렸습니다");
		}else if(selectNm==3) {
			for(int i = 0; i<dicNm.length;i++) {
				System.out.println((i+1)+"은"+dicNm[i]+"번 나왔습니다.");
			}
		}else if(selectNm==4) {
			int most=0;
			int max = 0;
			for(int i =0; i< dicNm.length;i++) {
				if(max<dicNm[i]) {
					max=dicNm[i];
					most = i+1;
				}				
			}System.out.println("가장 많이 나온 수는 "+most+"입니다.");
		}else if(selectNm==5) {
			System.out.println("프로그램 종료");
			break;
		}
	}
	
}
}
