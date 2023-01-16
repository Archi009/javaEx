package com.yedam.java;

import java.util.Scanner;

public class ProductProgram {
 //20230112문서 참조 
	private Scanner sc = new Scanner(System.in);
	private Product[] list = null;
	
	public ProductProgram() {
		while(true) {
			//메뉴 출력
			 menuPrint();
			//메뉴선택
			int selectNo = mecuSelect();
			
			if(selectNo ==1) {
				//상품수 입력
				inputProductNum();
				
			}else if(selectNo ==2) {
				// 상품 및 가격 입력
				inputProductInfo();
				
			}else if(selectNo ==3) {
				// 제품 가격
				productInfoPrint();
				
			}else if(selectNo ==4) {
				// 분석
				productanalsis();
				
			}else if(selectNo ==5) {
				//프로그램 종료
				exit();
				break;
			}else {
				//잘못된 메뉴 선택시 안내메시지 출력
				printErrorMessage();
			}
		}
		
	}

private void printErrorMessage() {
	System.out.println("메뉴 잘못선택했습니다.");
	
}

private void exit() {
	System.out.println("종료합니다");
	
}

private void productanalsis() {
	int max = 0;
	int productIndex = 0;
	for(int i= 0; i<list.length; i++) {
		Product product = list[i];
		if(max<product.getProPrice()) {
			max = product.getProPrice();
			productIndex = i ;						
		}
	}
	int sum = 0;
	for(int i= 0; i<list.length; i++) {
		if(i==productIndex) continue;
		
		Product product = list[i];
		sum += product.getProPrice();
	}
	System.out.println("최고가격을 가진 제품은"+list[productIndex].getProName()+"입니다.");
	System.out.println("최고 가격을 제외한 제품들의 합은 "+sum + "입니다.");
	
}

private void productInfoPrint() {
	for(Product product : list ) {
		System.out.printf("%s : %d \n", product.getProName(), product.getProPrice());
	}
	
}

private void inputProductInfo() {
	for(int i = 0; i<list.length; i++) {
		System.out.println("상품명>>");
		String name = sc.nextLine();
		System.out.println("상품가격>");
		int price = Integer.parseInt(sc.nextLine());
		
		Product product = new Product(name,price);
		
		list[i] = product;
	}
		
	}

private void inputProductNum() {
	System.out.print("상품수>");
	int productNum = Integer.parseInt(sc.nextLine());
	list = new Product[productNum];
	
}

private int mecuSelect() {
	System.out.print("선택>");	 
	return Integer.parseInt(sc.nextLine());
}

private void menuPrint() {
	System.out.println("====1.상품수 |2.상품및 가격 입력 | 3.제품별 가격 | 4.분석 |5.종료====");
	
}	
}

