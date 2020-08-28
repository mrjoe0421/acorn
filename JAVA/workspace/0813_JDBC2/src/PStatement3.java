import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PStatement3 {
	//deptno가 90인 애를 부서명 영업 지역을 제주
	public static void main(String[] args) { //데이터베이스 연동을 위한 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver"; //6_g.jav파일의 api로딩경로
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott"; //계정명
		String passwd = "tiger"; //비밀번호
		
		Connection con = null; //데이터베이스에 실제 접속을 시켜줌
		PreparedStatement pstmt = null; //connect를 이용해 sql명령을 실행하는 객체
		ResultSet rs = null; //sql실행후 select 결과를 저장하는 객
		
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, userid, passwd);	
			String sql = "update dept set dname=?, loc=? where deptno=?" ;
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "영업");
			pstmt.setString(2, "제주");
			pstmt.setInt(3, 90);
			
		
			int num = pstmt.executeUpdate();
			System.out.println(num);
			
			sql = "select deptno, dname, loc from dept where deptno=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 90);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
			}
			
			System.out.println();
			
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}

}
