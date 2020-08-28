package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxDAO {
	
	

	Connection con = null;
	public void update(Connection con,Dept xx)throws RecordNotFoundException {
		PreparedStatement pstmt = null;
		try {
			String sql = "update dept set" + "dname=?, loc=?, where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, xx.getDname());
			pstmt.setString(2, xx.getLoc());
			pstmt.setInt(3, xx.getDeptno());
			
			int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:"+num);
			
			if(num==0) {
				throw new RecordNotFoundException(xx.getDeptno()+"레코드없다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}//end upate

	public void delete(Connection con,int i){
		PreparedStatement pstmt = null;
			try {
				String sql = "delete from dept where deptno=?";
				pstmt =con.prepareStatement(sql);
			
				pstmt.setInt(1, i);
				
				int num=pstmt.executeUpdate();
				
				if(num==0) {
					throw new RecordNotFoundException("0이다");
				}
				
				} catch (Exception e1) {
					try {
						con.rollback();
						
						System.out.println("rollback");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void insert(Connection con,Dept xx)throws SQLException {
		PreparedStatement pstmt = null;
		
			String sql = "insert into dept (deptno,dname,loc)" + "values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			 pstmt.setString(2,xx.getDname());
			 pstmt.setString(3,xx.getLoc());
			 pstmt.setInt(1, xx.getDeptno());
			 
			 int num = pstmt.executeUpdate();
			 System.out.println("실행된 레코드 갯수:" + num);
		if(pstmt!=null)pstmt.close();
	}//end insert
	
	
	
public ArrayList<Dept> select(Connection con)throws SQLException {
	//con 사용
	//사용 후 rs, pstmt만 close
	ArrayList<Dept>list = new ArrayList<Dept>();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "select deptno x, dname,loc from dept ";
	pstmt = con.prepareStatement(sql);
	rs = pstmt.executeQuery();
	while(rs.next()) {
		int deptno = rs.getInt("x");
		String dname = rs.getString(2);
		String loc = rs.getString("loc");
		Dept dto = new Dept(deptno, dname,loc);
		list.add(dto);
	}
	if(rs!=null)rs.close();
	if(pstmt!=null)pstmt.close();
	return list;
	}//end select
}
