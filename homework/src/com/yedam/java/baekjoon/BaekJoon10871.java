package com.yedam.java.baekjoon;

import java.util.Scanner;

public class BaekJoon10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] intAry = new int[n];
		for(int i= 0; i<intAry.length; i++) {
			intAry[i] += sc.nextInt();
		}
		for(int no : intAry)
			if(no<x)System.out.print(no + " ");
	}
}
