package com.yedam.java.ch01.object;

public class Member {
	//필드
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}

	//메소드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //obj 가 member 의 인스턴스인가?
			Member member = (Member) obj;//강제 타입변환
			if(id.equals(member.id))// member의 id와 obj의 id를 비교한다.
				return true;
		}
		return false;
	}
	
	@Override 
	public int hashCode () {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
	
	
	
}
