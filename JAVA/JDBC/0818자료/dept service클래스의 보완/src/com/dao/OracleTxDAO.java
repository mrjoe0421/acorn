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
	public void update(Connection con,Dept xx)throws RecordNotFoundException {
		
	}//end upate

	public void delete(Connection con,int i) {
	
	}
	public void insert(Connection con,Dept xx) {
		
	}//end insert
	
	
	
public ArrayList<Dept> select(Connection con)throws SQLException {
	
	}//end select
}
