package com.biz;

import java.sql.Connection;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz {

	EmpDAO dao;
	JdbcTemplate temp= null;
	public EmpBiz() {
		dao = new EmpDAO();
		//temp= new JdbcTemplate();	
	}
	public ArrayList<EmpDTO> selectAllEmp(){
		Connection con = JdbcTemplate.getConnection();
		ArrayList<EmpDTO> list =  dao.selectAllEmp(con);
		JdbcTemplate.close(con);
		return list;
	}
	public EmpDTO selectDetailEmp( String eno) throws DataNotFoundException{
		Connection con = JdbcTemplate.getConnection();
		EmpDTO dto = dao.selectDetailEmp(con, eno);
		JdbcTemplate.close(con);
		return dto;
	}
	public void empUpdate( EmpDTO empDTO) throws DataNotFoundException{
		Connection con = JdbcTemplate.getConnection();
		dao.empUpdate(con, empDTO);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}
	public void empDelete( String empno) throws DataNotFoundException{
		Connection con = JdbcTemplate.getConnection();
		dao.empDelete(con, empno);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}
}
