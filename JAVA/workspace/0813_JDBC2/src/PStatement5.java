import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PStatement5 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver"; //6_g.jav파일의 api로딩경로
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott"; //계정명
		String passwd = "tiger"; //비밀번호
		
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, userid, passwd);
			String sql = "select * from dept order by deptno asc";
			
		}

	}

}
