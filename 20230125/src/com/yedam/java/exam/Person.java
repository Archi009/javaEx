package com.yedam.java.exam;

public class Person {
//	필드
	private String ssn;
	private String name;
	private String address;

//	생성자
	Person() {

	}

	Person(String ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

//	메소드
	public String getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setName(String name) {
		this.ssn = name;
	}

	public void setAddress(String address) {
		this.ssn = address;
	}

}
