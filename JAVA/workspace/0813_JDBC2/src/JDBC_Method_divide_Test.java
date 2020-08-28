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
	
	Connection con= null;
	ResultSet rs= null;
	PreparedStatement pstmt= null;
	
	public JDBC_Method_divide_Test() {
		//드라이버 로딩 
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
	
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		//connection 연결
	
		
	}		 
	
	public String deptAdata(int deptno) {
		//deptno를 select 하기 위한 sql문 작성
		String data = null;
		con = DriverManager.getConnection(url,userid,passwd);
		System.out.println("접속 성공");
		String sql = "select * from dept where deptno =?";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		pstmt.setInt(1, deptno);
		data=null;
		while(rs.next()) {
			int deptno1 = rs.getInt(1);
		}
		
		
		// 한부서의 정보를 string으로 리턴 
		
		
		
		return null;
	}
	public int delAdata(int deptno) {
		return 0;
	}
	public static void main(String[] args) {
	   //객체생성
		
	   //deptAdata 호출 검색 deptno전송 검색 결과 문자열로 받아서 출력

	}

}
