package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMybatisDAO dao;
	public OracleMyBatisService() {
		dao = new OracleMybatisDAO(); //dao 생성
	}
	public List<Dept> select() {
		SqlSession session = MySqlSessionFactory.getSession();
		List<Dept> list =null;
		try {
			list = dao.selectAll(session); //dao에 sqlSession전송
		} finally {
			session.close(); //connection.close()와 비슷, 모든 함수 마다 닫기
		}
		return list; //dao의 select 결과 메인으로 리턴
		}
	}// end class



