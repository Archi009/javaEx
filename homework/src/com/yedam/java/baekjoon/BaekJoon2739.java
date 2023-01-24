package com.yedam.java.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon2739 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			for(int j = N; j>0;j-- )
			if(j>i) {
				bw.write(" ");
			}else bw.write("*");
			
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	}

