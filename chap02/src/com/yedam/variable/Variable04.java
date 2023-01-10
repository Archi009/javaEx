package com.yedam.variable;

public class Variable04 {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
	    System.out.println(name); 
	    System.out.println(job);
	    
	    //이스케이프 문자
	    //문자열 (String)에서 사용
	    //\t : tab만큼 벌려라
	    //\n : enter
	    //\r : 맨 앞줄로 이동
	    
	    System.out.println("번호\t이름\t직업");
	    System.out.print("행 단위 출력\n");
	    // " '같은 문자를 사용하기 위해 백슬러시를 앞에 써준다 
	    System.out.print("우리는 \"개발자\" 입니다");
	    System.out.println("봄\\여름\\가을\\겨울");
	    
	    
	    
	    //실수
	    //float, double
	    //float
	    float va1 = 3.14f;
	    double va2 = 3.14;
	    
	    //정밀도 테스트
	    float var3 = 0.123125129581928591f;
	    double var4 = 0.1209102591902519859182501205;
	    
	    System.out.println("va3:" + var3);
	    System.out.println("va4:" + var4);
	    
	    
	    double var6 =3e6;
	    float var7 = 3e6F;
	    
	    System.out.println("va6:" + var6);
	    System.out.println("va7:" + var7);
	    
	    //논리 타입 (Boolean)
	    
	    boolean stop = true;
	    if(stop) {
	    	System.out.println("중지합니다");
	    	
	    }else {
	    	System.out.println("시작합니다");
	    }
	}
}
