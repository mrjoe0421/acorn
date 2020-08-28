package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger"; 		//4가지 정보

	OracleTxDAO dao;

	public OracleTxService() {
		//dao생성
		dao = new OracleTxDAO();
		//드라이버로딩
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}// end OracleDAO

	public ArrayList<Dept> select() throws SQLException {
		//db연결
		//select호출 - con을 인자로 넘김
		//connection 끊기close()
		//메인으로 ArrayList<Dept> 리턴 메인에서 결과 출력
		
		Connection con = null;
		ArrayList<Dept> list =null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.select(con);
		}finally {
			if(con !=null)
				con.close();
		}
		return list;
		
	}// end select

	public void insert(Dept xx) {
		Connection con = null;
	try {
		con = DriverManager.getConnection(url,userid, passwd);
		dao.insert(con, xx);
	} catch (SQLException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}finally {
		try {
			if(con!=null)con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}// end insert
	
	public void update(Dept xx2) {
		Connection con =null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			dao.update(con, xx2);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void delete(int i)throws RecordNotFoundException {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.delete(con, i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}//end deletes
	
	public void insertDelete(Dept dept, int i) throws Exception{
		Connection con =null;
		
			con = DriverManager.getConnection(url,userid,passwd);
			con.setAutoCommit(false); //tx의 시작
			dao.insert(con, dept);
			dao.delete(con, i); //고의 exception 발생
			con.commit();
//문제 발생시 con.rollback();
		
		
			try {
				if(con!=null)con.close();
				//con.setAutoCommit(true); //불필요
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	//con.commit();// tx완료시
	}
	
}



