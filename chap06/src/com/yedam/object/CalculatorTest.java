package com.yedam.object;

import java.util.Calendar;

public class CalculatorTest {
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		int result = calc.sum(10, 20);
		System.out.println(result);

		Calculator calc1 = new Calculator();
		int result1 = calc1.sum(10, 20);
		System.out.println(result);

		System.out.println(calc == calc1);
		
		CalculatorSingle calcSingle = CalculatorSingle.getInstance();
		CalculatorSingle calcSingle2 = CalculatorSingle.getInstance();
		System.out.println(calcSingle == calcSingle2);
		
		Calendar today = Calendar.getInstance();
		today.set(2023,2,1);		
		System.out.println(today.get(Calendar.DAY_OF_YEAR));
		
	}
}
