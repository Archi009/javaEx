package com.yedam.java.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon4344 {
	public static void main(String[] args) throws IOException {
		// 버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());// 케이스 수
		StringTokenizer st; // 성적 토큰화
		int[] arr; // 성적 담을 배열
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 성적토큰 담기 설정
			int M = Integer.parseInt(st.nextToken());// 학생수
			arr = new int[M];
			double sum = 0; // 성적 합
			for (int j = 0; j < M; j++) {
				int score = Integer.parseInt(st.nextToken());
				arr[j] = score;
				sum += score; // 토큰 합
			}
			double av = (sum / M);      //평균
			double count = 0;              //평균을 넘는 학생수
			for (int k = 0; k < M; k++) {
				if (arr[k] > av) {
					count++;
				}

			}
			System.out.printf("%.3f%%\n", (count / M) * 100);

		}

	}
}
