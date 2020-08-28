package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Product;

public class OracleMybatisDAO {

	public List<Product> selectAll(SqlSession session){
		List<Product> list = session.selectList("com.Product.PDMapper");
		return list;
	}
	

}
