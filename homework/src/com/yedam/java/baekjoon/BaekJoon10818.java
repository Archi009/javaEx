package com.yedam.java.baekjoon;

import java.util.Scanner;

public class BaekJoon10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] intAry = new int[n];
		int max = 0 ;
		int min = 0;
		for(int i=0; i<n; i++) {
			intAry[i]= sc.nextInt();
			if(i==0) {
				max = intAry[i];
				min = intAry[i];
			}
			if(max<intAry[i]) {
				max = intAry[i];
			}
			if(min>intAry[i]) {
				min = intAry[i];
			}
		}System.out.println(min+" "+max);
		
	}
}