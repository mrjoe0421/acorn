package com.dao;

public class OracleDAO implements DBDAO {

		@Override
	public void connect() {		
			System.out.println("OracleDAO.connect");
	}

		@Override
		public void insert() {
			System.out.println("OracleDAO.insert");
		}
		

//		public void connectOracle() {
//			System.out.println("OracleDAO.connect");
//			//오라클 db 접속하여 사용하는 함수-메소드
//		}
}
