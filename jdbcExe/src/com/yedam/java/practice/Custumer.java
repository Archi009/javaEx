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
		sql = "select user_id user_name, user_class, user_grade from host_id order by user_grade from host_id";
		List <ManVO> list = new ArrayList <>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(sql);
			while(rs.next()) {
				ManVO man = new ManVO();
				man.setUserId(rs.getString(2));
				man.setUserNm(rs.getString(4));
				man.setUserCl(rs.getString(7));
				man.setUserGd(rs.getString(8));
				list.add(man);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//반 별 조회
	public ManVO getManForCt(String grade) {
		sql = "selet user_id user_name, user_class, user_grade from host_id order by user_grade from user_id where user_grade = ?";
		connect();
		List <ManVO> list = new ArrayList <>();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, grade);;
			rs = psmt.executeQuery(sql);
		while(rs.next())  {
			ManVO man = new ManVO();
			man.setUserId(rs.getString(2));
			man.setUserNm(rs.getString(4));
			man.setUserCl(rs.getString(7));
			man.setUserGd(rs.getString(8));
			return man;
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public ManVO getForCt(String grade) {
		sql = "selet * from user_id where user_grade = "+grade;
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(sql);
		if(rs.next()) {
			ManVO man = new ManVO();
			man.setUserId(rs.getString(2));
			man.setUserId(rs.getString(4));
			man.setUserId(rs.getString(7));
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
		sql = "insert into user_id (user_no, user_id, user_ps,user_name,user_addr,user_phone"
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
	//클래스 수정
	public int updateClForCt(String n , String cl) {
		connect();
		sql="update user_id set user_class = ? where user_id = ?";
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
	
	//반 수정
	public int updateGrForCt(String n , String gr) {
		connect();
		sql="update user_id set user_grade = ? where user_id = ?";
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
	public int updateAllForCt(String n , String cl, String gr) {
		connect();
		sql="update user_id set user_class = ?,user_grade where user_id = ?";
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
	
	//삭제
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
		sql="update user_id set user_class = null where user_id = ?";
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
	public int delGrForCt(String n) {
		connect();
		sql="update user_id set user_grade = null where user_id = ?";
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
