package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;


public class EmpDAO {
	public ArrayList<EmpDTO> selectAllEmp(Connection con){
		//select 후 jdbcTemplate 이용 close		
		ArrayList<EmpDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			  String sql = "select empno,ename,job,mgr, to_char(hiredate,'YYYY-MM-DD')hiredate,sal,comm,deptno from emp order by empno desc";	
			  pstmt = con.prepareStatement(sql);
			  rs = pstmt.executeQuery();
			  while(rs.next()){
				  int empno = rs.getInt("empno");
				  String ename = rs.getString("ename");
				  String job = rs.getString("job");
				  int mgr = rs.getInt("mgr");
				  String hiredate = rs.getString("hiredate");
				  double sal = rs.getDouble("sal");
				  double comm = rs.getDouble("comm");
				  int deptno = rs.getInt("deptno");
				  EmpDTO notice = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				  list.add(notice);
			  }
			}catch(SQLException e){
				e.printStackTrace();
			}finally {
				JdbcTemplate.close(rs);
				JdbcTemplate.close(pstmt);
			}
		return list;
		
		
	}
	//사원번호로 찾기
	public EmpDTO selectDetailEmp(Connection con, String eno) throws DataNotFoundException{
		//select 후 jdbcTemplate 이용 close
		EmpDTO result = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select empno,ename,job,mgr,to_char(hiredate,'YYYY-MM-DD')hiredate,sal,comm,deptno from emp where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(eno));
			if(rs.next()) {
				 int empno = rs.getInt("empno");
				  String ename = rs.getString("ename");
				  String job = rs.getString("job");
				  int mgr = rs.getInt("mgr");
				  String hiredate = rs.getString("hiredate");
				  double sal = rs.getDouble("sal");
				  double comm = rs.getDouble("comm");
				  int deptno = rs.getInt("deptno");
				  result = new EmpDTO(empno,ename,job,mgr,hiredate,sal,comm,deptno);
			}else {
				throw new DataNotFoundException(eno+"에 해당하는 사원정보가 없습니다. 확인후 다시 조회하세요");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(pstmt);
		}
		return result;
	}
	public void empDelete(Connection con, String empno) throws DataNotFoundException, SQLException{
		//delete 후 jdbcTemplate 이용 close
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from emp where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(empno));
			int n = pstmt.executeUpdate();
			if(n==0) {
				throw new DataNotFoundException(empno + "에 해당하는 사원정보가 없습니다. 확인 후 다시 조회하세요");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(pstmt);
		}
		
	}
	public void empUpdate(Connection con, EmpDTO empDTO) throws DataNotFoundException, SQLException {
		PreparedStatement pstmt = null;
		try {
			String sql = "update emp set"+ "  job=?,  sal=? where deptno=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, empDTO.getEmpno());
			pstmt.setString(1, empDTO.getJob());
			pstmt.setDouble(2, empDTO.getSal());
			
			int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:" + num);
			if(num ==0) {
				throw new DataNotFoundException(empDTO.getDeptno() + "에 해당하는 사원정보가 없습니다. 확인 후 다시 조회하세요");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
		
	}
}
