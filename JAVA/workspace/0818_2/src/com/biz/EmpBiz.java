package com.biz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz {

		//dao생성
		EmpDAO	dao ;
		JdbcTemplate temp = null;
		public EmpBiz() {
			dao = new EmpDAO();
		}		
	
	public ArrayList<EmpDTO> selectAllEmp() throws SQLException  {
		// JdbcTemplate.getConnection()에서 con 얻기
		//dao.selectAllEmp(con); 호출 conn 전달
		//JdbcTemplate 이용 close(con) 으로 컨넥션 끊기
		Connection con = JdbcTemplate.getConnection();
		ArrayList<EmpDTO> list = dao.selectAllEmp(con);
		JdbcTemplate.close(con);
		return list;
	}
		
	public EmpDTO selectDetailEmp(String eno) throws DataNotFoundException, SQLException{
		// JdbcTemplate.getConnection()에서 con 얻기
		//dao.selectDetailEmp(con); 호출
		//jdbcTemplate 이용 close
		Connection con = JdbcTemplate.getConnection();
		EmpDTO dto = dao.selectDetailEmp(con, eno);
		JdbcTemplate.close(con);
		return dto;
	}
	public void empUpdate( EmpDTO empDTO) throws DataNotFoundException, SQLException{
		Connection con = JdbcTemplate.getConnection();
		dao.empUpdate(con, empDTO);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
		
	}
	public void empDelete( String empno) throws DataNotFoundException, SQLException{
		Connection con = JdbcTemplate.getConnection();
		dao.empDelete(con, empno);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}
}
