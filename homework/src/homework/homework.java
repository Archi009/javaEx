package homework;

public class homework {
	public static void main(String[] args) {
//		1번
		int intValue = 37;
		int intValue10 = 91;
		System.out.println("intVale1:" + intValue10);
		System.out.println("intVale:" + intValue);

//		2번
		int a1 = intValue + intValue10;
		int b1 = intValue - intValue10;
		int c1 = intValue * intValue10;
		int d1 = intValue / intValue10;
		System.out.println("합:" + a1);
		System.out.println("차:" + b1);
		System.out.println("곱:" + c1);
		System.out.println("분:" + d1);

//		3번
//		byte var1 = 128;
		int int1 = 128;
		System.out.printf("%d,int \n", int1);
//		-2  char var2 = "B";
		String str1 = "B";
		System.out.printf("%s,String \n", str1);
//		-3  String var3 = 44032;
		char char1 = 44032;
		System.out.printf("%s,char \n", char1);
//		-4  int var4 = 100000000000;
		long long1 = 100000000000L;
		System.out.printf("%d,long \n", long1);
//		-5  float var5 = 43.93106;
		double double1 = 43.93106;
		System.out.printf("%f,double \n", double1);
//		-6  long var6 = 301.3;
		float float1 = 301.3f;
		System.out.printf("%f,float \n", float1);

// 		4번 문제
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;

//		4-1)
		long result1 = a + c + d;
		System.out.println("long 타입:" + result1);

//		4-2 )
		int result2 = a + b + c;
		System.out.println("int 타입 :" + result2);

//		 4-3 )
		double e = 45.31;
		double result3 = c + d + e;
		System.out.println("double 타입:" + result3);

//		5번
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = "번지";

		System.out.println(charValue + ((intValue1 + intValue2) + (intValue3 + strValue)) + (double) intValue4);
//		System.out.println(charVAlue+String.valueOf(intValue1+intValue2)+intValue3+strValue+(double)intValue4);

//		추가문제
		int value = 485;
		// int remainder = 485 % 10;
		int qut = 485 / 10; // 48
		// int remainder = qut%10;
		int qut1 = qut / 10; // 4
		int qut2 = qut - qut1 * 10; // 8
		int qut3 = value - qut * 10; // 5

		System.out.println("결과는" + (qut1 + qut2 + qut3));

	}
}
