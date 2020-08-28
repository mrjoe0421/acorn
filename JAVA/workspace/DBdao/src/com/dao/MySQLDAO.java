package com.dao;

public class MySQLDAO implements DBDAO {
	
		@Override
	public void connect() {
			System.out.println("MySQLDAO.connect");
		
	}

		@Override
	public void insert() {
			System.out.println("MySQLDAO.insert");
			
		}
		
}
