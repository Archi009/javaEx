package com.yedam.java.exam3;

public class Count {
	public static void main(String[] args) {
		String[] arr = { "010102-4", "991012-1", "960304-1", "881012-2", "040403-3" };
		int man = 0;
		int woman = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i].substring(7,8));
			if (num % 2 == 1) {
				man++;
			} else if (num % 2 == 0) {
				woman++;
			} else
				System.out.println("유효한 값이 아닙니다.");
		}
		System.out.println("남 " + man + " 여 " + woman);
	}
}
