package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExe {
	public static void main(String[] args) {
		// jdbc 오라클 데이터 CRUD 작업.
		// 1. ojdbc.jar라이브러리.
		// 2. Connection 객체 . db연결 쿼리 실행 or 실행 결과 통로.
		// 3. ResultSet 객체. 데이터 처리 결과를 담기 위한 객체
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;

		// jdbc driver 정상. jdbc연결 시도 (java database connection
		// jdbc driver 체크
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러.");
			e.printStackTrace();
		} 									
		
//		변수 초기화 
											// port번호
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";
		
		String sql = "insert into employees(employee_id, job_id, last_name, email, hire_date)"
				+ "values(400,'IT_PROG','홍','HONG',sysdate)";
		String delSql = "delete from employees where employee_id=300";
		String upSql = "update employees set first_name='길동' where employee_id = 300";
		
		// connection 확인
		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("연결성공!!");

			stmt = conn.createStatement(); // 쿼리 실행, 처리결과 객체.

			int r = stmt.executeUpdate(sql); // insert, update,delete
			int d = stmt.executeUpdate(delSql);
			int u = stmt.executeUpdate(upSql);
			rs = stmt.executeQuery("select * from employees order by employee_id");

			while (rs.next()) {
				System.out.println("사원 번호 : " + rs.getInt("employee_id") + ", 이름 : " + rs.getString("first_name")
						+ ", 이메일 : " + rs.getString("email") + ", 급여 : " + rs.getInt("salary"));
			}
			System.out.println("end of records");
		} catch (SQLException e) {
			System.out.println("처리실패");
			e.printStackTrace();
		}
	}
}
