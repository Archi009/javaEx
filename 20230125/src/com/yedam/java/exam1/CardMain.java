package com.yedam.java.exam1;

public class CardMain {
	public static void main(String[] args) {
		TossCard t = new TossCard("123-332","123213",213,"신빛용");
		DGBCard d = new DGBCard("1613-2165", "3531", 654, "신빛용");
		t.showCardInfo();
		d.showCardInfo();
	}
}
