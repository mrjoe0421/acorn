package com.service;
import com.dao.DBDAO;
public class DBService {
	
		DBDAO dao = null;
		private static DBService service = new DBService();
		//2.static으로 자신의 객체 생성
		public static DBService getService() {
			return service;
		}
		//3. 생성한 객체를 가져갈 수 있는 static함수 만들기
		
		//1.생성자를 private로 막기
		private DBService() {}
		public void setDAO(DBDAO dao) {
			this.dao = dao;
			dao.connect();
		}
		public void insert() {
			dao.insert();
		}
}

