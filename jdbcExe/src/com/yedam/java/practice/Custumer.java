package com.yedam.java.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Custumer {
	//변수 필드 설정
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "dev";
	String pass =  "dev";
	
	Connection conn;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	
	String sql;
	
	
	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}		
	}
	
	
	//CRUD
	//목록 조회
	public List<ManVO> manVoListForCt(){
		connect();
		sql = "select user_id, user_name, user_class, user_grade from host_id";
		List <ManVO> list = new ArrayList <>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(sql);
			while(rs.next()) {
				ManVO man = new ManVO();
				man.setUserId(rs.getString(1));
				man.setUserNm(rs.getString(2));
				man.setUserCl(rs.getString(3));
				man.setUserGd(rs.getString(4));
				list.add(man);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//본인조회
	public ManVO getSelfForCt(String id) {
		sql = "select user_id, user_addr, user_phone, user_class, user_grade from host_id where user_name = ?";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
		if(rs.next()) {
			ManVO man = new ManVO();
			man.setUserId(rs.getString(1));
			man.setUserAd(rs.getString(2));
			man.setUserPh(rs.getString(3));
			man.setUserCl(rs.getString(4));
			man.setUserGd(rs.getString(5));
			return man;
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//반 별 조회
	public List<ManVO> getManForCt(String grade) {
		connect();
		sql = "select user_id user_name, user_class, user_grade from host_id where user_grade = ?";
		List <ManVO> list = new ArrayList <>();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, grade);;
			rs = psmt.executeQuery(sql);
		while(rs.next())  {
			ManVO man = new ManVO();
			man.setUserId(rs.getString(1));
			man.setUserNm(rs.getString(2));
			man.setUserCl(rs.getString(3));
			man.setUserGd(rs.getString(4));
			list.add(man);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//비밀번호 조회
	public ManVO getPsForCt(String id) {
		connect();
		sql = "select user_ps from host_id where user_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery(sql);
		if(rs.next()) {
			ManVO man = new ManVO();
			man.setUserPs(rs.getString(1));		
			return man;
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	// 입력
	public int addManForCt(ManVO man) {
		connect();
		sql = "insert into host_id (user_no, user_id, user_ps,user_name,user_addr,user_phone"
		+"values(seq.nextval,?,?,?,?,?)";
		int r=0;
		try {
			psmt =conn.prepareStatement(sql);
			psmt.setString(2, man.getUserId());
			psmt.setString(3, man.getUserPs());
			psmt.setString(4, man.getUserNm());
			psmt.setString(5, man.getUserAd());
			psmt.setString(6, man.getUserPh());
			
			r= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	//클래스, 반 수정
	//클래스 신청
	public int updateClForCt(String n , String cl) {
		connect();
		sql="update host_id set user_class = ? where user_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,cl);
			psmt.setString(2, n);
			
			r= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
		
	}
	
	//반 신청
	public int updateGrForCt(String n , String gr) {
		connect();
		sql="update host_id set user_grade = ? where user_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, gr);
			psmt.setString(2, n);
			
			r= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
		
	}
	
	//반 클래스 모두 신청
	public int updateAllForCt(String n , String cl, String gr) {
		connect();
		sql="update host_id set user_class = ?,user_grade where user_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, cl);
			psmt.setString(2, gr);
			psmt.setString(3, n);
			
			r= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
		
	}
	
	//탈퇴
	public int delManForCt(String n,String id) {
		connect();
		sql = "delete from host_id where user_name = ? and user_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, n);
			psmt.setString(2, id);
			
			r = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	//클래스 삭제
	public int delClForCt(String n) {
		connect();
		sql="update host_id set user_class = null where user_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, n);
			
			r= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
		
	}
	//수업 취소
	public int delGrForCt(String n) {
		connect();
		sql="update host_id set user_grade = null where user_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, n);
			
			r= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
		
	}

}
