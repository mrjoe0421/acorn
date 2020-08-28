import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_3 {

	public static void main(String[] args) {
		
		//1. 4가지 정보
				String driver="oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String userid="scott";
				String passwd = "tiger";
		//2. 드라이버 설치
				Connection con = null;
				Statement stmt = null;
				ResultSet rs = null;
				
		//3.오라클 연결(Connection 연결)
				try {
					Class.forName(driver);
					con = DriverManager.getConnection(url, userid, passwd);
					System.out.println("접속 성공");
				
		//4. sql 작성
				int deptno = 13;
				String deptname = "개발";
				String loc = "서울";
				String sql = "insert into dept (deptno,dname,loc)"
						+ "values ("+deptno+", '"+deptname+"','"+loc+"')";
				System.out.println(sql);
				
				stmt = con.createStatement();
				
				int result = stmt.executeUpdate(sql);
				System.out.println("실행된 레코드 갯수:" + result);
				//하단에 select dept 후 결과 출력 코드 작성
				String sql2 = "select deptno, dname, loc from dept";
				rs = stmt.executeQuery(sql2);
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
					}
				} 
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						if(rs!=null)rs.close();
						if(stmt!=null)stmt.close();
						if(con!=null)con.close();
					}catch (SQLException e) {
					e.printStackTrace();
				}
					}
	}

}
