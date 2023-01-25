package com.yedam.java.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BcakWord {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte[] st=br.readLine().getBytes();	
		char word ;
		for(int i=st.length-1;i>=0;i--) {
			word = (char)st[i];
			System.out.print(word);
		}
		
		
	}
}
