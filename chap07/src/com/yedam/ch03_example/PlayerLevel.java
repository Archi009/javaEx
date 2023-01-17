package com.yedam.ch03_example;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	
	public abstract void showLevelMessage();
	
	public final void go(int count) { //공통으로 들어가되 수정 할 필요 없는것.
		run();
		for(int i = 0 ; i  < count; i++) {
			jump();
		}
		turn();
	}
	
	
}
