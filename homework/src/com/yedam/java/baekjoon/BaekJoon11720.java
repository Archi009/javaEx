package com.yedam.java.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11720 {
	public static void main(String[] args) throws IOException{
		 //숫자의 합
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				br.readLine();	
				
				int sum = 0;
				
				for(byte value : br.readLine().getBytes()) {
					sum += (value - '0');	// 또는 (a-48)
				}
				
				System.out.print(sum);
				
			}
		
	}

