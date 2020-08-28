import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Main {
	static String driver = "oracle.jdbc.driver.Oracle.OracleDriver";
	static url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static String userid = "scott";
	static String passwd = "tiger";

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			String sql = "select * from dept where deptno desc";
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt.
			rs = pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
