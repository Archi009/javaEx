package com.yedam.Q2;

public class PortableNotebook implements Notebook, Tablet {
//	필드
	private int MODE;
	private String spreadSheet;
	private String browser;
	private String kindaVedio;
	private String kindaApp;

//	생성자
	PortableNotebook(String spreadSheet, String browser, String kindaVedio, String kindaApp) {
		this.MODE = NOTEBOOK_MODE;
		this.spreadSheet = spreadSheet;
		this.browser = browser;
		this.kindaVedio = kindaVedio;
		this.kindaApp = kindaApp;
		if(MODE==NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			System.out.println("TABLET MODE ");
		}else {
			MODE = NOTEBOOK_MODE;
			System.out.println("NOTEBOOK MODE");
		}
	}

//	메소드
	public void changeMode() {
		if(MODE==NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			System.out.println("TABLET MODE로 바꿉니다. ");
		}else {
			MODE = NOTEBOOK_MODE;
			System.out.println("NOTEBOOK MODE로 바꿉니다");
		}
	}
	
	
	@Override
	public void watchVideo() {
		System.out.println(kindaVedio + "를 시청.");
	}

	@Override
	public void useApp() {
		if(MODE==NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
		}else {
			MODE = NOTEBOOK_MODE;
		}
		
		System.out.println(kindaApp + "를 실행");

	}

	@Override
	public void writeDocumentation() {
		System.out.println(spreadSheet + "를 통해 문서 작성.");

	}

	@Override
	public void searchInternet() {
		System.out.println(browser + "를 통해 인터넷 검색 .");

	}

}
