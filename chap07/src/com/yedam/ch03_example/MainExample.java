package com.yedam.ch03_example;

public class MainExample {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);

		player.upgradePevel(new AdvancedLevel());
		player.play(2);
		
		player.upgradePevel(new SuperLevel());
		player.play(3);
	}
}
