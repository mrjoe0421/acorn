package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.Dept;

public class OracleMybatisDAO {
	//DAO는 DB를 사용해 데이터를 조회하거나 조작하는 기능
	public List<Dept> selectAll(SqlSession session) {
		//<select id="selectAll"
		List<Dept>	list= session.selectList("selectAll"); //id값을 받아온다. //모든 값을 받아 올 때 쓰이는 경우
		return list;
	}
	
	public Dept selectByDeptno(SqlSession session){
		Dept list = session.selectOne("selectByDeptno"); //하나의 값만 받아올 때
		return list;
	}
	
	public Dept selectByDeptno(SqlSession session,int deptno){
		Dept list = session.selectOne("selectByDeptnoUse",deptno); //하나의 값만 받아올 때
		return list;
	}
	
	public void deptInsert(SqlSession session, Dept dept) { //session == MySqlSessionFactory.getSession(); ,  dept == new Dept(16,"운영", "춘천");
		int num = session.insert("deptInsert", dept);
		System.out.println("추가된 레코드==="+num);
	}

}
