import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PStatement2 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver"; //6_g.jav파일의 api로딩경로
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott"; //계정명
		String passwd = "tiger"; //비밀번호
		
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept (deptno,dname,loc)" + "values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, 12);
//			pstmt.setString(2, "개발");
//			pstmt.setString(3, "서울");
//			int num = pstmt.executeUpdate();
//			System.out.println("실행된 레코드 갯수:" + num);
			
			sql = "select deptno, dname, loc from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
			}
			
			String sql2 = "select * from dept where deptno=12";
			
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	}

}
