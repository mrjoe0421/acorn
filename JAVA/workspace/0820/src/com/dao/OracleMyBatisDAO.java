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

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {
	// 1. 4가지 정보
	
	
	public List selectAllHash(SqlSession session) {
		List list = session.selectList("selectAllHash");
		return list;
	}
	
	public OracleMyBatisDAO() {
	
	}

	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept= session.selectOne("selectByDeptno", deptno);		
		return dept;
	}
	
	public List<Dept> selectAll(SqlSession session){
		//<select id="selectAll" resultType="com.dto.dept">
		List<Dept> list= session.selectList("com.dept.DeptMapper2.deptselectAll");
		return list;
	}
		
	public void insert(SqlSession session, Dept dept) {
		int num= session.insert("com.dept.DeptMapper2.deptInsert", dept);
		System.out.println("추가된 레코드 ===="+ num);
	}
	
	public void delete(SqlSession session,int deptno) {
		int num= session.delete("deleteDept", deptno);
		System.out.println("삭제된 갯수 ===="+ num);
	}
	
	public void update(SqlSession session, Dept dept) {
		int num = session.update("com.dept.DeptMapper2.updateDept", dept);
		System.out.println("업데이트된 갯수===="+ num);
	}
	
	public int deptRecordCount(SqlSession session) {
		int num =session.selectOne("com.dept.DeptMapper2.selectCount" );
		return num;
		
	}
	

	public List<Dept> selectByDeptNameAndLoc(SqlSession session,Dept dept) {
	//1.dao에서 부서이름, 지역을 이용 and select 완성 후 아래처럼 수정
	//dao에서 dept를 검사 부서이름만 있는 경우
	//지역만 있는 경우
	//둘  다 있는 경우를 판단한여 Mapper.xml의 id를 다르게 호출하여
	//select 결과 리턴
		List<Dept> list = null;
		if(dept.getDname()!=null && dept.getLoc()!=null) {
			list=session.selectList("selectByNameLoc",dept);
		}
		if(dept.getDname()!=null && dept.getLoc()!=null) {
			list=session.selectList("selectByName", dept);
		}
		if(dept.getDname()!=null && dept.getLoc()!=null) {
			list=session.selectList("selectByloc",dept);
		}
		return list;
	}
	public List<Dept> selectByHashMap(SqlSession session, HashMap<String, Integer> map){
		//select deptno ~~~~ between a and b
		//main에서 hashmap 생성 a, b 값 설정 service=> dao로 인자로 넘김
		//sql에서 key를 이용 a,b 값을 설정 (parameterType=hashmap)
		List<Dept> list = session.selectList("selectByHashMap", map);	
		return list;
	}
	
	public List selectBydeptNoIn(SqlSession session, HashMap map) {
		//main에서 3개의 key를 map에 설정 넘김
		//sql에서 select ~~~ In 사용 결과를 리턴 메인에서 출력 deptno = 11, 12, 40 검색
		List<Dept> list = session.selectList("selectBydeptNoIn", map);
		return list;
	}

	public HashMap selectByDeptnoHashMap(SqlSession session, int deptno) {
		HashMap map = session.selectOne("selectByDeptnoHashMap", deptno);
		return map;
	}

	}
	

