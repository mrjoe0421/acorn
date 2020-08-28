package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.dao.OracleDAO;
import com.dto.Dept;

import exception.RecordNotFoundException;

public class OracleService {

	OracleDAO dao;

	public OracleService() {
		//dao생성
		 dao = new OracleDAO();
	}
	public void insert (Dept dept) {
		dao.insert(dept);
	}	
	public void update(Dept dept) throws RecordNotFoundException{
		dao.update(dept);
	}
	public void delete(int deptno) throws RecordNotFoundException{
		dao.delete(deptno);
	} //메인에서 호출 ->dao.insert호출
	
	public ArrayList<Dept> select()throws SQLException {
	//Dao의 select함수 호출  실제 데이터 받아오기 	
		ArrayList<Dept> list = dao.select();
		return list;
		
	}
	public ArrayList<Dept> selectByNameLoc(HashMap<String, String> map) throws SQLException, Exception {
		// TODO Auto-generated method stub
		ArrayList<Dept> list = dao.selectByNameLoc(map);
		return list;
	}
}
	

