import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class StatementTest {
	public static void main(String[] args) {
		//1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";//6_g.jar파일의 api로딩경로
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userid ="scott";
		String passwd ="tiger";
	
		Connection con = null;
		Statement stmt= null; 
		ResultSet rs =null; 		
		try {
			Class.forName(driver);
		 con = DriverManager.getConnection(url, userid, passwd);			
		 String sql="select deptno x,dname,loc from dept "; // ;제거 주의		
		//String sql="select deptno ,dname,loc from dept "; // ;제거 주의		
		stmt= con.createStatement();
		 rs= stmt.executeQuery(sql);
		 while(rs.next()) {
			 int deptno= rs.getInt("x");
			 String dname= rs.getString("dname");
			 String loc= rs.getString("loc");
			 System.out.println(deptno+ "\t"+ dname+ "\t"+ loc);
		 }
		 	}catch (ClassNotFoundException e) {			
				e.printStackTrace();
			} catch (SQLException e) {			
				e.printStackTrace();
			}finally {
				try {
					//6. 자원반납 반대순서로 실행 
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(con!=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	
	}//end main
}
// end class
