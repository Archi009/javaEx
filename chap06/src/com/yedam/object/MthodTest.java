package com.yedam.object;

public class MthodTest {
public static void main(String[] args) {
	StringUtil su = new StringUtil();
	StringUtil.greet();
	Integer.parseInt("1");//static 메소드의 대표적인 예
	//good mornig 출력
	StringUtil.greet("good mornig");
	int l = StringUtil.greetLength("goodmornig");
	System.out.println(l);
	
}
}
