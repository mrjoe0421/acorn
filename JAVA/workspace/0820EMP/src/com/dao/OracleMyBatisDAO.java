package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.Emp;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {
	// 1. 4가지 정보
	
	public OracleMyBatisDAO() {
	
	}

	
	public List<Emp> selectAll(SqlSession session){
		//<select id="selectAll" resultType="com.dto.dept">
		List<Emp> list= session.selectList("selectAll");
		return list;		
	}
	
	public Emp selectByEmpno(SqlSession session, int empno) {
		Emp emp = session.selectOne("selectByEmpno", empno);
		return emp;
		
	}
	
	public void insert(SqlSession session, Emp emp) {
		int num = session.insert("insertEmp", emp);
		System.out.println("추가된 레코드===="+ num);
	}
	
	public void delete(SqlSession session, int empno) {
		int num= session.delete("deleteEmp", empno);
		System.out.println("삭제된 레코드===="+num);
	}
	
	public void update(SqlSession session, Emp emp) {
		int num = session.update("updateEmp", emp);
		System.out.println("수정된 레코드===="+num);
	}

	}
	

