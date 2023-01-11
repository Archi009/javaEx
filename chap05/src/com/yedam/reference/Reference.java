package com.yedam.reference;

public class Reference {
	public static void main(String[] args) {
		int intVal = 10;
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null;
		
		System.out.println(array); //reference 출력 
		System.out.println(array2);//reference 출력
		System.out.println(array==array2);// 주소값의 비교
		System.out.println(array[0]==array2[0]);// 데이터비교
		System.out.println(intVal);  // 기본타입 이므로 데이터 바로 출력
		System.out.println(array3[0]);
		
		
		
		
		
		
		
		
	}
}
