package com.yedam.java.ch02_02;

public class SmartTelevision implements SmartTv{

	public int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if (volume >= RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨: " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url+"를 검색합니다.");
	}

	@Override
	public void alarm(String time) {
		System.out.println(time +"에 알람을 맞췄습니다");
	}
}
