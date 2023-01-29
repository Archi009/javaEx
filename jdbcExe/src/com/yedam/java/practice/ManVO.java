package com.yedam.java.practice;

public class ManVO {
 
	private int no;
	private String userId;
	private String userPs;
	private String userNm;
	private String userAd;
	private String userPh;
	private String userCl;
	private String userGd;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPs() {
		return userPs;
	}
	public void setUserPs(String userPs) {
		this.userPs = userPs;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getUserAd() {
		return userAd;
	}
	public void setUserAd(String userAd) {
		this.userAd = userAd;
	}
	public String getUserPh() {
		return userPh;
	}
	public void setUserPh(String userPh) {
		this.userPh = userPh;
	}
	public String getUserCl() {
		return userCl;
	}
	public void setUserCl(String userCl) {
		this.userCl = userCl;
	}
	public String getUserGd() {
		return userGd;
	}
	public void setUserGd(String userGd) {
		this.userGd = userGd;
	}
	@Override
	public String toString() {
		return "[no=" + no + ", userId=" + userId + ", userPs=" + userPs + ", userNm=" + userNm + ", userAd="
				+ userAd + ", userPh=" + userPh + ", userCl=" + userCl + ", userGd=" + userGd + "]";
	}
	
	public String toString(int i) {
		return "[ 회원 아이디 : " + userId + ", 성함 : " + userNm + ", 주소 : "
				+ userAd + ", 연락처=" + userPh + ", 회원등급 : " + userCl + ", 진행 중인 수업 : " + userGd + "]";
	}
	//회원이 조회
	public String toStringCuSearch() {
		return "[ 회원 아이디 : " + userId + ", 이름 : "
				+ userNm + ", 회원등급= : " + userCl + ", 진행 중인 수업 : " + userGd + "]";
	}
	//관리자 조회
	public String toStringManagerSearch() {
		return "[ 회원 아이디 : " + userId + ", 주소 : "
				+ userAd + ", 연락처 : " + userPh + ", 회원등급= : " + userCl + ", 진행 중인 수업 : " + userGd + "]";
	}
	//본인 조회
	public String toStringCuSelfSearch() {
		return "[ 회원 아이디 : " + userId + ", 주소 : "
				+ userAd + ", 연락처 : " + userPh + ", 회원등급= : " + userCl + ", 진행 중인 수업 : " + userGd + "]";
	}
	
}
