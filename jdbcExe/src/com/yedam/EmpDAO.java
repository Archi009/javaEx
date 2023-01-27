package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDAO {
	//사용할 변수들 필드 설정
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
	String pass = "hr";

	Connection conn;
	Statement stmt = null;
	//파라메터 값 자리에 ?를 사용해서 재사용성을 높인다.
	PreparedStatement psmt = null; //좀 더 편하게 sql구문 사용가능
	ResultSet rs = null;
	
	String sql;
	
	
	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("에러발생.");
			e.printStackTrace();
		}
	}
//C(create) R(read) U(update) D(delete) 처리
	
	//목록조회.
	public List<Map<String, Object>> empList(){
		sql = "select * from emp_temp";
		connect();
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Map<String, Object>map =new HashMap<>();
				map.put("emp_id", rs.getInt("employee_id"));
				map.put("first_name", rs.getString("first_name"));
				map.put("last_name", rs.getString("last_name"));
				map.put("email", rs.getString("email"));
				map.put("salary", rs.getInt("salary"));
				
				list.add(map);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return list;
	}
	//위의 List<Map<String,Object>>와 비교.
	public List<EmpVO> empVoList()	{
		connect();
		sql = "select * from emp_temp";
		List <EmpVO>list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmpVO emp = new EmpVO();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));		
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	//단건조회.
	public EmpVO getEmp(int id) {
		sql= "select * from emp_temp where employee_id= "+id;
		connect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				EmpVO emp = new EmpVO();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));		
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				return emp;
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // 조회된 데이터 없음.
	}
	//입력.
	public int addEmp(EmpVO emp)	{
		connect();
		sql = "insert into emp_temp (employee_id, last_name, email, hire_date, job_id )"
				+ "values(?,?,?,?,?)";
		int r =0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			
			r = psmt.executeUpdate(); // 처리된 건수. 성공하면 1 //1개 처리 했으니까.
									
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}
	
	//급여만 수정
	public int updateEmp(int eid, int sal)	{
		connect();
		sql = "update emp_temp set salary = ? where employee_id = ?";
		int r =0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sal);
			psmt.setInt(2, eid);
			
			r = psmt.executeUpdate(); // 처리된 건수. 성공하면 1
									
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
		
	}
	

	
	//삭제.
	public int delEmp(int eid)	{
		connect();
		sql = "delete from emp_temp where employee_id = ?";
		int r =0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, eid);
			
			r = psmt.executeUpdate(); // 처리된 건수. 성공하면 1
									
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
		
	}
}
