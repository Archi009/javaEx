package homework;

import java.util.Scanner;


public class homework20230112 {
	static Scanner sc = new Scanner(System.in);
	static Product[] prucAry = null;
	public static int menuSelect() {
		System.out.println("======================");
		System.out.println("1.상품 수|2.상품 및 가격 입력|3.제품별 가격|4.분석|5.종료");
		System.out.println("======================");
		
	    int selectNm = Integer.parseInt(sc.nextLine());
	          return selectNm;
	}
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		// 출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		int prucNm = 0;
		
		while(true) {			
			 int selectNm = menuSelect();
			if (selectNm == 1) {
				//상품수
				System.out.println("상품수를 입력하시오>>");
				prucNm = Integer.parseInt(sc.nextLine());				
				
			}else if (selectNm == 2) {
				//상품 및 가격 입력
				prucAry = new Product[prucNm];
				for(int i = 0; i<prucAry.length; i++) {
					prucAry[i] = new Product();
					System.out.println("상품 명을 입력하시오>>");
					prucAry[i].name = sc.nextLine();
					System.out.println("상품 가격을 입력하시오>>");
					prucAry[i].price = Integer.parseInt(sc.nextLine());	
				}				
				
			}else if (selectNm == 3) {
				//제품별 가격
				for(Product check:prucAry) {
					check.getInfo();
				}
				
			}else if (selectNm == 4) {
				//분석
				int total = 0; 
				int max = 0;
				String expenPro = null;
				for (int i = 0; i < prucAry.length; i++) {
					//비교 기준값을 정해줌
					max = prucAry[0].price;
					//최댓값
					if(max<prucAry[i].price) {
						max=prucAry[i].price;
						expenPro=prucAry[i].name;
					}
					total += prucAry[i].price;
				}
				System.out.println("최고가격 제품:"+ expenPro + "을 제외한 가격의 총합"+(total-max)+"원");
					
			}else if (selectNm == 5) {
				//종료
				System.out.println("프로그램 종료");
				break;
			}
			
			
			
			
			
			
			
		}
		
		
	}
}
