package com.dao;

import java.util.HashSet;

public class OracleService {

	OracleDAO dao;
	
	public OracleService() {
		dao = new OracleDAO(); //OracleService객체 생성시 OracleDAO를 생성 후
		//멤버변수로 지정
	}
	public HashSet<String> select() {
		HashSet<String> xxx= dao.select();
		return xxx;
	}
}
