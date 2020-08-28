package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMybatisDAO dao;
	public OracleMyBatisService() {
		dao = new OracleMybatisDAO();
	}
	public List<Dept> select() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<Dept> list =null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
	}// end class
	
	
	public Dept selectByDeptno() {
		SqlSession session = MySqlSessionFactory.getSession();
		Dept dept =null;
		try {
			dept=  dao.selectByDeptno(session);
		} finally {
			session.close();
		}
		return dept;
		
	}
	
	
	public Dept selectByDeptno (int deptno) {
		SqlSession session = MySqlSessionFactory.getSession();
		Dept list = null;
		try {
			list = dao.selectByDeptno(session, deptno);// == Dept [deptno=10, dname=ACCOUNTING, loc=AAA]
		} finally {
			session.close();
		}
		return list; // == Dept [deptno=10, dname=ACCOUNTING, loc=AAA]
	}
	
	public void deptInsert(Dept dept) { //dept == new Dept(16,"운영", "춘천");
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			dao.deptInsert(session, dept);
			session.commit();
		} finally {
			session.close();
		}
	
	}
	

}
