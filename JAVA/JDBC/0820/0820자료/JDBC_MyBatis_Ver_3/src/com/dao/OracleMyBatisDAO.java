package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {
	// 1. 4가지 정보
	
	public OracleMyBatisDAO() {
	
	}
	public List<Dept> selectByDeptNameAndLoc(SqlSession session, Dept dept) {

		List<Dept> list = null;
		if(dept.getDname()!= null && dept.getLoc() != null) {
			list=session.selectList("selectByNameLoc",dept);
		}
		if(dept.getDname()!= null && dept.getLoc()==null) {
			list=session.selectList("selectByName", dept);
		}
		if(dept.getDname()== null && dept.getLoc()!=null) {
			list=session.selectList("selectByloc", dept);
		}		
		return list;
	}
	public void delete(SqlSession session,int deptno) {
		int num= session.delete("deptDelete", deptno);
		System.out.println("삭제된 갯수 ===="+ num);
	}
	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept= session.selectOne("selectByDeptno", deptno);		
		return dept;
	}
	public List<Dept> selectAll(SqlSession session){
		//<select id="selectAll" resultType="com.dto.dept">
		List<Dept> list= session.selectList("selectAll");
		return list;
	}
	
	public void insert(SqlSession session, Dept dept) {
		int num= session.insert("deptInsert", dept);
		System.out.println("추가된 레코드 ===="+ num);
	}
	
	
	public void update(SqlSession session, Dept dept)  {
		int num= session.update("deptUpdate", dept);
		System.out.println("업데이트 갯수===="+ num);
}

}
