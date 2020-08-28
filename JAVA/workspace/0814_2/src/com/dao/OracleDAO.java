package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dto.Dept;
import exception.RecordNotFoundException;


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
	
	public ArrayList<Dept> select()  {
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
			if(rs!=null)
				try {
					rs.close();
					if(pstmt!=null)pstmt.close();
					if(con!= null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
		return list;
	}//end select
	public void insert(Dept dept) {
		int num =0;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "insert into dept (deptno,dname,loc) values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			 num = pstmt.executeUpdate();
			System.out.println(num);
		} catch (Exception e) {
			// TODO: handle exception
		}
	} //dept 받아와서  insert 후 갯수 출력
	public void update(Dept dept) throws RecordNotFoundException{
		
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "update dept set dname=?, loc=? " + "where deptno =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			int num = pstmt.executeUpdate();
			
			if(num==0) {
				throw new RecordNotFoundException();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//update가 없을 시에 RecordNotFoundException(사용자 정의 ex발생)
	//업데이트할 자료가 없습니다. 메시지 출력
	
	public void delete(int deptno) throws RecordNotFoundException {
		int n =0;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "delete from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 90);
			n =pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//RecordNotFoundException(사용자 정의 ex발생) 삭제할 자료가 없습니다. 메세지 출력
//	public ? selectByDeptNo(int deptno) throws RecordNotFoundException {
//		
//	}
	public ArrayList<Dept> selectByNameLoc(HashMap<String,String> map) throws RecordNotFoundException{
		ArrayList<Dept> list = new ArrayList<Dept>();
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select deptno x, dname, loc from dept where dname=? and loc=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, map.get("dname"));
			pstmt.setString(2, map.get("loc"));
			rs = pstmt.executeQuery();
			while(rs.next()){
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				Dept dto = new Dept(deptno, dname,loc);
				list.add(dto);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//메인에서 map에 키 "name"-"개발", "loc"-"제주"로 넘김
		//value 만 꺼내서 select, 결과를 ArrayList에 담아서 리턴
		//레코드가 없는 경우 "검색한 자료가 없습니다." Ex 발생
		return list;
		
	}
	
}



