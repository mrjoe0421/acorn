package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;

import com.dto.Emp;
import com.exception.RecordNotFoundException;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	
	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();
	}
	
	public List<Emp> selectAll(){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Emp> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list; 
	}
	public Emp selectByEmpno(int empno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		Emp emp=null;
		try {
			emp = dao.selectByEmpno(session, empno);
		} finally {
			session.close();
		}
		return emp;
	}
	
	public void insert(Emp emp){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.insert(session, emp);
			session.commit();
		} finally {
			session.close();
		}
	}
	public void delete(int empno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.delete(session, empno);
			session.commit();
		} finally {
			session.close();
		}
	}
	public void update(Emp emp) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.update(session, emp);
			session.commit();
		} finally {
			session.close();
		}
	}
	

}
