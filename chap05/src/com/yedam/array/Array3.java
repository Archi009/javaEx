package com.yedam.array;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열
		int[] ary;
		// 배열의 크기(인덱스 갯수)
		int no;
		//배열의 크기 입력
		System.out.println("배열의 크기>");
		no = Integer.parseInt(sc.nextLine());

		ary = new int[no];
		//크기 확인
		System.out.println(ary.length);
		//일일이 배열 입력
		for (int i = 0; i < ary.length; i++) {
			System.out.println("입력>");
			ary[i] = Integer.parseInt(sc.nextLine());
		}
		//입력 배열 확인
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}

		// 최댓값 최솟값 구하기
		int max = ary[0];
		int min = ary[0]; 
		//비교대상의 기준값을 지정해 줘야 바른 비교가 
		//이루어지는데 그 기준값을 배열안에서 해결하면 쉽게 해결 가능하다
		for (int i = 0; i < ary.length; i++) {
			if (max < ary[i]) {
				max = ary[i];
			}
		}
		System.out.println("최댓값은" + max);
		for (int i = 0; i < ary.length; i++) {
			if (min > ary[i]) {
				min = ary[i];
			}
		}
		System.out.println("최소값은" + min);

	}
}
