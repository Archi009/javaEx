package com.yedam.java.ch01.object;

public class Key {
	// 필드
	public int number;

	// 생성자
	public Key(int number) {
		this.number = number;
	}

	// 메소드

	@Override

	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key key = (Key) obj;
			if (number == key.number)
				return true;
		}
		return false;
	}


}
