import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_1 {

	public static void main(String[] args) {
		//1. 4가지 정보
				String driver = "oracle.jdbc.driver.OracleDriver"; //6_g.jav파일의 api로딩경로
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String userid = "scott"; //계정명
				String passwd = "tiger"; //비밀번호
				
		//2. 드라이버 생성
				Connection con = null;
				Statement stmt = null;
				ResultSet rs = null;
				
				try {
				Class.forName(driver);
				System.out.println("드라이버 로딩 성공");
		//3.오라클 연결
				con = DriverManager.getConnection(url, userid, passwd);
				System.out.println("접속성공");
		//4. sql 작성
				String sql = "select deptno, dname, loc from dept";
				
		//5. SQL 실행준비= Statement, PreparedStatement, CallableStatement(PL/SQL)
				stmt = con.createStatement();
		//6. Statement를 이용 실행해서 결과받기
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					int deptno = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
					System.out.println(deptno+"\t"+dname+"\t"+loc);
				}
				
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}catch(SQLException e) {
					e.printStackTrace();
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
			
			}
}
	