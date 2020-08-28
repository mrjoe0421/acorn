package com.service;

import com.dao.MySQLDAO;
import com.dao.OracleDAO;

public class DBService {
		//MySQLDAO dao= null;
		OracleDAO dao = null;
//		public void setDAO(MySQLDAO dao) {
//			this.dao = dao;
//			dao.connectMySQL();//실제 실행할 dao클래스의 db접속 함수 호출
//		}
		public void setDAO(OracleDAO dao) {
			this.dao = dao;
			//dao.
			dao.connectOracle();
		}
}
