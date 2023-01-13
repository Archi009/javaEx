package com.yedam.exam01;

public class Num1 {
public static void main(String[] args) {
	

	int num1 =10;
	double num2 = 2.0;
	//더하기
	int sum = (int) (num1 + num2);
	//빼기
	int sub = (int)(num1 - num2);
	//곱하기
	int mult = (int)( num1 * num2);
	//나누기
	int div = (int) (num1 / num2);
        System.out.println("합 : "+sum+"차 : "+sub+"곱 : "+mult+"분 : "+div);
        
        
        //위와 비교해보자
        
        int x =10;
        double y = 2.0;
        System.out.printf("%d + %.1f = %d\n",x,y,(int)(x+y));
        System.out.printf("%d - %.1f = %d\n",x,y,(int)(x-y));
        System.out.printf("%d * %.1f = %d\n",x,y,(int)(x*y));
        System.out.printf("%d / %.1f = %d\n",x,y,(int)(x/y));
	}
}
