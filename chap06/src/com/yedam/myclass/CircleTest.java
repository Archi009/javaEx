package com.yedam.myclass;

import com.yedam.object.Circle;

public class CircleTest {
public static void main(String[] args) {
	Circle circle = new Circle();
	circle.setR(10);
	double area = circle.area();
	System.out.println(area);
}
}
