package com.employee.biz;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.employee.entity.Employee;
import com.employee.entity.Engineer;
import com.employee.entity.Sales;
import com.employee.exception.DataNotFoundException;

public class EmployeeBiz implements IEmployeeBiz {

	// 사원 목록 보기
	@Override
	public List<Employee> selectAllEmployee() {
		List<Employee> list = new ArrayList<>();
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			//리스트에서 사원정보를 읽고
			// 영업인 경우 salse 생성, 리트스에 담아 리턴
			// 엔지니어인 경우  engineer 생성, 리트스에 담아 리턴 

			}
		} finally {
			session.close();
		}
		return list;
	}

	// 사원정보 검색하기
	@Override
	public List<Employee> searchList(String inputSubMenu, String searchWord) throws DataNotFoundException {
		/*
		 * 1.사번 검색 2.이름 검색 3.부서 검색 4.근무지 검색 5.연봉 검색
		 */
		List<Employee> list = new ArrayList<>();
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			//Map에 inputSubMenu0, searchWord 저장 
			//selectList 시  Map을 넘김, 조건에 맞는 결과를 map을 담은 list로 받기
			// 영업인 경우 salse 생성, 리트스에 담아 리턴
			// 엔지니어인 경우  engineer 생성, 리트스에 담아 리턴 
			기		}catch(Exception e){ 
			throw new DataNotFoundException("");
		} finally {
			session.close();
		}
		return list;
	}// end printSearchList

	@Override
	public int createEmployeeNum() {
		int num = 0;

		SqlSession session = MySqlSessionFactory.getSession();
		try {
		//추가할 사원번호 얻어오기 mapper.createEmployeeNum 호출
		} finally {
			session.close();
		}
		return num;
	}

	// 새로운 사원 생성
	@Override
	public void employeeInsert(Employee emp) {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			//map에 사원정보 저장
			//영업일 경우 dname추가 
			//사업일경우 일 경우 dname추가 
			//employee.employeeInsert 호출 map넘기기
			//
			} finally {
			session.close();
		}
	}

	// 사원 수정
	@Override
	public void employeeUpdate(Employee emp) throws DataNotFoundException {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			//map에 사원정보 수정
			//영업일 경우 dname추가 
			//사업일경우 일 경우 dname추가 
			//employee.employeeInsert 호출 map넘기기
			//
			int n = session.update("employee.employeeUpdate", m);
			
			session.commit();
		}catch(Exception e){ 
			throw new DataNotFoundException("");
		} finally {
			session.close();
		}
	}// end employeeUpdate

	// 사원 삭제
	@Override
	public void employeeDelete(int empno) throws DataNotFoundException {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
		//사원번호 이용 사원 삭제 
		}catch(Exception e){ 
			throw new DataNotFoundException("");
		} finally {
			session.close();
		}
	}// end employeeDelete

	// 근태관리( 외출/출장/휴가/근무)
	@Override
	public void employeeService(int empno, String inputColumn) throws DataNotFoundException {
		SqlSession session = MySqlSessionFactory.getSession();
		try {
			//map에 사원번호 , 근태 상황저장 mapper.employeeSerivce
		  // 
		  session.commit();
		}catch(Exception e){ 
			throw new DataNotFoundException("");
		} finally {
			session.close();
		}
	}

}// end class
