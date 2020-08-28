import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	public static void main(String[] args) {

		//0. oracle_jar파일 buildPath에추가
		//1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver"; //6_g.jav파일의 api로딩경로
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott"; //계정명
		String passwd = "tiger"; //비밀번호
		
		
		//2. 드라이버 생성
		Connection con = null;//데이터베이스에 실제 접속을 시켜줌
		//PreparedStatement pstmt = null;
		Statement stmt = null; //connect를 이용해 sql명령을 실행하는 객체
		ResultSet rs = null; //sql실행 후 select 결과를 저장하는 객체
		
		try {
		//1.드라이버 로딩(11번째줄driver)
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		//2. 오라클 연결( Connection 연결) url, id, passwd 사용
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("접속성공");
		//3. sql 작성
//			String sql = "select deptno , dname, loc from dept "; //제거
			String sql = "select deptno x, dname, loc from dept where dname''";
				
		//4. SQL 실행준비= Statement, PreparedStatement, CallableStatement(PL/SQL)
			stmt = con.createStatement(); //conection에서 명령을  실행시켜줄 stmt를 불러온다
	
		//5. Statement를 이용 실행해서 결과받기
			rs =stmt.executeQuery(sql); //Select결과를 ResultSet으로 받음
			
			while(rs.next()) {
				int deptno = rs.getInt("1");
				String dname = rs.getString("2");
				String loc = rs.getString("3");
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace(); //
		}catch(SQLException e) {
			e.printStackTrace(); //sql 실행 대비
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	
		//7. 자원반납 반대순서로 실행 
				
	
	}//end main
}
// end class
