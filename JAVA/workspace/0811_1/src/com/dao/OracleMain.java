package com.dao;

import java.util.HashSet;

public class OracleMain {

	public static void main(String[] args) {
		
		OracleService service = new OracleService(); //객체생성
		HashSet<String> xxx = service.select();
		for(String s : xxx) {
			System.out.println(s);
		}

	}

}
