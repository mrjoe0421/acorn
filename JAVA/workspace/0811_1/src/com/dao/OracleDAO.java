package com.dao;

import java.util.HashSet;

public class OracleDAO {
	//select 호출시 데이터 저장된 set 변환
	public HashSet<String> select() {
		HashSet<String> set = new HashSet<String>(); //객체생성
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		return set;
	}

}
