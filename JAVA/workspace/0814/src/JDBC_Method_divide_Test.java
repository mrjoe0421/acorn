import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBC_Method_divide_Test {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	
	public JDBC_Method_divide_Test() {
		//드라이버 로딩
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
//	public String search(String loc, String name) { //sql문 하나로
//	//지역만 넘어온 경우 지역만 검색 결과 리턴
//	//이름만 넘오온 경우 이름만 검색 결과 리턴
//	//이름, 지역이 넘어온 경우 두 가지를 이용 검색 결과 리턴
//	}
//	
	//부서전체 select 
	public ArrayList<DeptDTO> getAllDept(){
		
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select * from dept ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				DeptDTO dept = new DeptDTO();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
				list.add(dept);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		return list;
//		return result;
	}
		
		
		//결과를 메인으로 리턴 메인에서 전체 데이터 출력 
	
	
	//주소로 select 
	//검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력 
	public  ArrayList<String> searchDeptByLoc(String loc){
		ArrayList<String> list = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select * from dept where loc=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, loc);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String result = "";
				result+=rs.getInt(1);
				result+=rs.getString(2);
				result+=rs.getString(3);
				result += "\n";
				list.add(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
		
	}
	
	
	public  ArrayList<String> searchDeptByName(String dname) { //arrayList이용
		//부서이름으로로 select 
		
		ArrayList<String> list = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select * from dept where dname=?";
//			sql = sql + "dname=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dname);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String result = "";
				result += rs.getInt(1);
				result += rs.getString(2);
				result += rs.getString(3);
				result += "\n";
				list.add(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return list;

		//검색한 내용을 ? 로 리턴 메인에서 전체 데이터 출력 
	}
	
	
	public int updateDept(DeptDTO dept){
		int result = 0;
		//부서번호로 dname, loc업데이트 후 
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "update dept set dname =?, loc =? " + "Where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			 result  = pstmt.executeUpdate();
			System.out.println(result + "개의 레코드가 수정");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//업데이트 결과 갯수 리턴
		return result;
	}
	
	
	public int insertDept(DeptDTO dept){
		int result = 0;
		//부서하나 추가후 
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert dept (deptno, dname,loc)" + "values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			result = pstmt.executeUpdate();
			System.out.println(result +"개의 insert 결과 리턴");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//insert 결과 갯수 리턴
		return result;
	}
	
	
	public DeptDTO getdeptAdata(int deptno) {
		DeptDTO dept = null;
//		부서번호로 select 
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			String sql = "select * from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);		
			rs = pstmt.executeQuery();
//			System.out.println(result + "");
			while(rs.next()) {
				dept = new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dept;
//		검색 결과가 없을 경우 사용자 정의 Exception 발생(RecordNotFoundException-메세지
//		찾는 부서 번호가 없습니다.
//		검색한 내용을 문자열로 리턴
		}

	
	public static void main(String[] args) {
		JDBC_Method_divide_Test test= new JDBC_Method_divide_Test();
		ArrayList<DeptDTO> list = test.getAllDept();
		for(DeptDTO x : list) {
			System.out.println(x.getDname());		
		}
//		ArrayList<String> list = test.getAllDept();
//		for(String x : list) {
//			System.out.println(x);
//		}
//		ArrayList<String> list1 = test.searchDeptByLoc("제주");
//		for(String x : list1) {
//			System.out.println(x);
//		}
//		ArrayList<String> list3 = test.searchDeptByName("영업");
//		for(String x : list3) {
//			System.out.println(x);
//		}
//		ArrayList<String> list4 = test.getdeptAdata(90);
//		for(String x : list4) {
//			System.out.println(x);
//		}
//		System.out.println(test.updateDept("영업", "경기", 90));
//		System.out.println(test.insertDept("운영", "충북", 92));
//		System.out.println(test.searchDeptByLoc("AAA"));
//		System.out.println(test.getdeptAdata(11));
//		System.out.println(test.searchDeptByName("영업"));
		System.out.println(test.getdeptAdata(90));
//		System.out.println(test.delAdata(90));	}
	}
}
