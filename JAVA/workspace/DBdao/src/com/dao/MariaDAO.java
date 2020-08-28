package com.dao;

public class MariaDAO implements DBDAO {

	@Override
	public void connect() {
		System.out.println("MariaDAO.connect");
		
	}
	@Override
	public void insert() {
		System.out.println("MariaDAO.insert");
		
	}
	
}
