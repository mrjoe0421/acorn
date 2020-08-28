import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Method_divide_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "scott";
	String passwd = "tiger";
	
	Connection con= null; //데이터베이스에 실제 접속
	PreparedStatement pstmt= null; //connect 후 sql명령 실행
	ResultSet rs= null; //sql 실행 후 select 결과를 저장하는 객체
	
	public JDBC_Method_divide_Test() {
		//드라이버 로딩 
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}		 
	
	public String deptAdata(int deptno) {
		String data = null;
		try {
			con = DriverManager.getConnection(url,userid,passwd);
			//deptno를 select 하기 위한 sql문 작성
			String sql = "select * from dept where deptno=?"; //sql문 작성
			pstmt = con.prepareStatement(sql); //sql문 실행준비
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery(); //pstmt 이용해 결과 받기
			data =null;
			while(rs.next()) {
				int deptno =rs.getInt(1);
				String dname =rs.getString(2);
				String loc =rs.getString(3);
				data = deptno + "\t" + dname + "\t" + loc;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 한부서의 정보를 string으로 리턴 
		return null;
	}
	public int delAdata(int deptno) {
		int num = 0;
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public static void main(String[] args) {
	   //객체생성
		//deptAdata 호출 검색 deptno전송 검색 결과 문자열로 받아서 출력

	}

}
