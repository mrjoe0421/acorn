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
	String passwd = "tiger";

	OracleTxDAO dao;

	public OracleTxService() {
		//드리아버 로딩
		//dao생성
	}// end OracleDAO

	public ArrayList<Dept> select() throws SQLException {
		//db연결
		//select호출
		//connection 끊기
	}// end select

	public void insert(Dept xx) {
		
	}// end insert
	public void update(Dept xx2)throws RecordNotFoundException {
	

	}//end deletes

}



