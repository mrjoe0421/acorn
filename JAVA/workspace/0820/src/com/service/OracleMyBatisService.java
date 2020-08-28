package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleMyBatisDAO();

	}
	public int deptRecordCount()  {
		//dept 테이블 전체 레코드 갯수 메인에서 출력
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int num=0;
		try {
			num = dao.deptRecordCount(session);
		} finally {
			session.close();
		}
		return num;
	}
	
	public  void delete(int deptno) {
		// deptno 으로 삭제 후 dao에서 삭제 갯수 출력
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.delete(session, deptno);
			session.commit();
		} finally {
			session.close();
		}
		
	}
	
	public void update(Dept dept) {
		// deptno으로 update 후 dao에서 update 갯수 출력
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.update(session, dept);
			session.commit();
		} finally {
			session.close();
		}
	}
	public Dept selectByDeptno(int deptno) {
		SqlSession session= MySqlSessionFactory.getSqlSession();
		Dept dept=null;
		try {
		 dept=	dao.selectByDeptno(session, deptno);
		}finally {
			session.close();
		}
		return dept;
	}
	public void insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.insert(session, dept);
			session.commit();//명시적으로 꼭 해주어야 함. 
		} finally {
			session.close();
		}
	}

	public List<Dept> selectAll() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<Dept> selectByDeptNameAndLoc(Dept dept){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list =null;
		try {
			list = dao.selectByDeptNameAndLoc(session, dept);
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<Dept> selectByHashMap(HashMap<String, Integer> map){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectByHashMap(session, map);
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<Dept> selectBydeptNoIn(HashMap map){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectBydeptNoIn(session, map);
		} finally {
			session.close();
		}
		return list;
	}
	
	public HashMap selectByDeptnoHashMap(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		HashMap map =null;
		try {
			map = dao.selectByDeptnoHashMap(session, deptno);
		} finally {
			session.close();
		}
		return map;
	}
	
	public List selectAllHash() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List list  = null;
		try {
			list= dao.selectAllHash(session);
		} finally {
			session.close();
		}
		return list;
	}
	
//	public ArrayList<Dept> select() throws SQLException{
//	
//		ArrayList<Dept> list= null;
//		try {//con닫기
//		 con= DriverManager.getConnection(url, userid, passwd);
//		 list = dao.select();		 
//		}finally {
//		
//		}
//		return list;
//	}
//	public void insert(Dept xx) {
//	
//	
//		try {//con닫기
//	
//			 dao.insert( xx);		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//		
//		}		
//	 }
//	public void update(Dept xx) throws RecordNotFoundException {
//		Connection con= null;
//	
//		try {//con닫기
//	
//			 dao.update(con, xx);		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			
//		}		
//	 }
//	public void delete(int i)  {
//	
//		
//		try {//con닫기
//
//			dao.delete(con, i);		 
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//
//		}		
//	}

}
