package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

public class OracleDAO {

	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
			
	public OracleDAO() {
		//드라이버 로딩
		try {
			Class.forName(driver);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end OracleDAO
	
	public ArrayList<Dept> select() throws SQLException {
		//dept테이블 전체 select dept객체로 생성 arrayList에 add 후
		//service로 리턴 service 에서는 다시 메인으로 리턴 메인에서 출력
		//메인->service.select()->dao.select 호출
		//dao.select ()의 arrayList->service.select()->메인으로 리턴
		//메인에서 전체 데이터 출력
		
		//전체 데이터 리턴 출력
	//	Dept dept = new Dept();
		ArrayList<Dept> list = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select * from dept"
					+ " ";
			pstmt = con.prepareStatement(sql);
			rs =  pstmt.executeQuery();
			while(rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
				list.add(dept);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!= null)con.close();
		}
		return list;
	}//end select
	public void insert() {}
	public void update() {}
	public void delete() {}
	
}



