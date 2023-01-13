package com.yedam.object;

public class Book {
	// 필드
	String name;
	String kind;
	int price;
	String publisher;
	String isbn;

	// 생성자
	Book(String name, String kind, int price, String publisher, String isbn) {
		this.name = name;
		this.kind = kind;
		this.price = price;
		this.publisher = publisher;
		this.isbn = isbn;
	}

	Book(int price, String publisher, String isbn) {

		this.price = price;
		this.publisher = publisher;
		this.isbn = isbn;
	}

	// 매개변수 순서에 따른 생성자 오버로딩
	// 데이터 타입 기준으로 순서를 따진다.
	Book(String isbn, int price) {
		this.price = price;
		this.isbn = isbn;
	}

	Book(int price, String isbn) {
		this.price = price;
		this.isbn = isbn;
	}

	// 매개변수 갯수에 따른 생성자 오버로딩
	Book(int price) {
		this.price = price;
	}
	//매개변수가 없는 생성자 = 기본생성자
	Book(){
		
	}
	// 메소드
	void getInfo() {

		System.out.println(name);
		System.out.println("#내용");
		System.out.println("종류 : " + kind);
		System.out.println("가격 : " + price + "원");
		System.out.println("출판사 : " + publisher);
		System.out.println("도서번호 : " + isbn);
	}
}
