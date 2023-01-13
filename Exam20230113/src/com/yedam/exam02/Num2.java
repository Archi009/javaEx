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
	
	
	//위와 비교해 보자
	
	int[] coin = new int[4];
	money = 2680;
	for (int i=0;i<coin.length;i++) {
		if(money >= 500) { //500보다 크니까 500원으로 나눌여지가 있다
			coin[i] = money / 500;
			money = money%500;
			System.out.print("500원 : "+coin[i]+"개\t");
		}else if(money >=100) {
			coin[i]	= money /100;
			money = money%100;
			System.out.print("100원 : "+coin[i]+"개\t");
		}else if(money >=50) {
			coin[i]	= money /50;
			money = money%50;
			System.out.print("50원 : "+coin[i]+"개\t");
		}else if(money >=10) {
			coin[i]	= money /10;
			money = money%10;
			System.out.print("10원 : "+coin[i]+"개\t");
		}
	}
	
}
}
