package com.yedam.java.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
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
		//아이디 중복 조회
				public ManVO getId(String id) {
					connect();
					sql = "select user_no from host_id where user_id = ?";
					try {
						psmt = conn.prepareStatement(sql);
						psmt.setString(1, id);
						rs = psmt.executeQuery(sql);
					if(rs.next()) {
						ManVO man = new ManVO();
						man.setNo(rs.getInt(1));		
						return man;
					}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return null;
				}
		
		//비밀번호 조회
		public ManVO getPs(String id) {
			sql = "select user_ps from host_id where user_id = ?";
			connect();
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
		//회원가입
		public int addLo(ManVO man) {
			connect();
			sql = "insert into host_id ( user_id, user_ps,user_name,user_addr,user_phone"
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
		
}

