package service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {

	OracleDAO dao; //null

	public OracleService() {
		//dao생성
	}
	public ArrayList<Dept> select()throws SQLException {
	//Dao의 select함수 호출  실제 데이터 받아오기 	
		OracleDAO dao = new OracleDAO();
		ArrayList<Dept> list = dao.select();
		return list;
	}
	
}
