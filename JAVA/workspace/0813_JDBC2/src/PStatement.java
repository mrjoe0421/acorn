import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PStatement {

	public static void main(String[] args) {
		//오라클 데이터베이스 연동을 위한 4가지 정보를 저장한다.
		String driver = "oracle.jdbc.driver.OracleDriver"; //6_g.jav파일의 api로딩경로
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott"; //계정명
		String passwd = "tiger"; //비밀번호
		
		Connection con =null; //데이터베이스에 실제 접속을 시켜줌
		PreparedStatement pstmt = null; //connect를 이용해 sql명령을 실행하는 객체
		ResultSet rs = null; //sql실행 후 select 결과를 저장하는 객체
		
		try {
			//드라이브 로딩
			Class.forName(driver); 
			System.out.println("드라이브 구동 성공");
			//오라클연결
			con = DriverManager.getConnection(url,userid,passwd);
			System.out.println("연결성공");
			//sql 작성
			String sql = "select deptno x, dname, loc from dept";
			//sql 실행준비
			pstmt = con.prepareStatement(sql);
			//statement를 이용 실행해서 결과받기
			rs = pstmt.executeQuery();
		while(rs.next()) {
			int deptno = rs.getInt("x");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno+ "\t"+dname+"\t"+loc);
		}
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)con.close();
		}catch(Exception e) {
			e.printStackTrace();
		} //try ~ catch 문이라 예외상황을 써준다 
		 //finally에 역순으로 
	}	
}
	}

	
