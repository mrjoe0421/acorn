package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMybatisDAO;
import com.dto.Product;

public class OracleMyBatisService {

	OracleMybatisDAO dao;
	public OracleMyBatisService() {
		dao =new OracleMybatisDAO();
	}
	public List<Product> selectpd(Product product) {
		SqlSession session = MySqlSessionFactory.getSession();
		List<Product> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
		session.close();	
		}
		return list;
		
	}// end class


}
