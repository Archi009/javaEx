package com.yedam.java.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10809 {

		public static void main(String[] args) throws IOException {
			//단어에 알파벳 위치찾기
			
			BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[] alpahbet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
					"v","w","x","y","z"};
			
			String word = br.readLine();
			for(int i = 0 ; i < alpahbet.length ; i++) {
				bw.write(String.format("%d ", word.indexOf(alpahbet[i])));
			}
			
			br.close();
			bw.flush();
			bw.close();
		}

	}
