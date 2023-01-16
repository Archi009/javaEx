package com.yedam.common;

import java.util.Scanner;

import com.yedam.java.Product;

public class ProductProgram {
 //20230112문서 참조 
	public ProductProgram() {
		Scanner sc = new Scanner(System.in);
		Product[] list = null;
		int productNum = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("====1.상품수 |2.상품및 가격 입력 | 3.제품별 가격 | 4.분석 |5.종료====");
			System.out.print("선택>");
			int selectNo = Integer.parseInt(sc.nextLine());
			//nextLine과 nextInt nextDouble 혼용 하지 말자, 나중에 찾아보긔
			
			if(selectNo ==1 ) {
				System.out.print("상품수>");
				productNum = Integer.parseInt(sc.nextLine());
				list = new Product[productNum];
			}else if(selectNo ==2 ) {
				for(int i = 0; i<list.length; i++) {
					System.out.println("상품명>>");
					String name = sc.nextLine();
					System.out.println("상품가격>");
					int price = Integer.parseInt(sc.nextLine());
					
					Product product = new Product(name,price);
					
					list[i] = product;
				}
			}else if(selectNo ==3 ) {
				for(Product product : list ) {
					System.out.printf("%s : %d \n", product.getProName(), product.getProPrice());
				}//인덱스가 필요하다 -> 일반 for문
				//인덱스 필요없고 첨부터 끝까지 보겠다 ->향상된 for문
				
			}else if(selectNo ==4 ) {
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
				//list[productIndex].getProName() => list 안 productIndex위치의 객체의 값 
			}else if(selectNo ==5 ) {
				System.out.println("종료합니다");
				return;
			}else {
				
			}
				
		 
			
			
			
			
		
		}
				
				
	}
}
