package com.yedam.exam02;

public class Num2 {
public static void main(String[] args) {
	//큰 금액부터 동전을 우선적으로 거슬러 줘야한다.
	int[] coinUnit = new int[4];
	int money = 2680;
	System.out.println("money ="+money);
	for (int i=0;i<coinUnit.length;i++) {
		if(i==0) {
			coinUnit[i] = money/500;
			money = money%500;
		}else if(i==1){
			coinUnit[i] = money/100;
			money = money%100;
		}else if(i==2){
			coinUnit[i] = money/50;
			money = money%50;
		}else if(i==3){
			coinUnit[i] = money/10;
			money = money%10;
		}	
		
	}
	System.out.println("500원 : "+coinUnit[0]+"개, "+"100원 : "+coinUnit[1]+"개, "+"50원 : "+coinUnit[2]+"개, "+"10원 : "+coinUnit[3]+"개");
}
}
