package com.yedam.java.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.net.aso.s;

public class Managing {
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
	public List<ManVO> manVoList(){
		connect();
		sql = "select user_id, user_name, user_addr, user_phone, user_class, user_grade from host_id order by user_grade";
		List <ManVO> list = new ArrayList <>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				ManVO man = new ManVO();
				man.setUserId(rs.getString(1));
				man.setUserNm(rs.getString(2));
				man.setUserAd(rs.getString(3));
				man.setUserPh(rs.getString(4));
				man.setUserCl(rs.getString(5));
				man.setUserGd(rs.getString(6));
				list.add(man);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}
	
	//단건조회
	public ManVO getMan(String id) {
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
	
	// 입력
	public int addMan(ManVO man) {
		connect();
		sql = "insert into host_id (user_id, user_ps,user_name,user_addr,user_phone"
		+"values(seq.nextval,?,?,?,?,?)";
		int r=0;
		try {
			psmt =conn.prepareStatement(sql);
			psmt.setString(1, man.getUserId());
			psmt.setString(2, man.getUserPs());
			psmt.setString(3, man.getUserNm());
			psmt.setString(4, man.getUserAd());
			psmt.setString(5, man.getUserPh());
			
			r= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	//클래스, 반 수정
	//클래스 수정
	public int updateCl(String n , String cl) {
		connect();
		sql="update host_id set user_class = ? where user_name = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,cl);
			
			r= psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
		
	}
	
	//반 수정
	public int updateGr(String n , String gr) {
		connect();
		sql="update host_id set user_grade = ? where user_name = ?";
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
	
	//반 클래스 모두 수정
	public int updateAll(String n , String cl, String gr) {
		connect();
		sql="update host_id set user_class = ?,user_grade = ? where user_name = ?";
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
	
	//회원 삭제
	public int delMan(String n,String id) {
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
	public int delCl(String n) {
		connect();
		sql="update host_id set user_class = null where user_name = ?";
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
	
	//반 삭제
	public int delGr(String n) {
		connect();
		sql="update host_id set user_grade = null where user_name = ?";
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
