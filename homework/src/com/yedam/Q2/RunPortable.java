package com.yedam.Q2;

public class RunPortable {
	public static void main(String[] args) {
		PortableNotebook pn = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		pn.writeDocumentation();
		pn.watchVideo();
		pn.useApp();
		pn.searchInternet();
	}
}
