package com.yedam.java.test;

import java.util.Scanner;

public class CountString {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		char[] charArr = st.toCharArray();
		int[] alp = new int[26];
		for(int i = 0 ; i<st.length();i++) {
			alp[charArr[i]-97] ++;
		}
		for(int i = 0; i<alp.length;i++) {
			if(alp[i]==0) {
			continue;
			}	
			System.out.println(charArr[i]+" "+alp[i]+"개");
		}
	
	}
}
