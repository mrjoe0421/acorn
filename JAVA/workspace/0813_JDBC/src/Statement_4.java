import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_4 {

	public static void main(String[] args) {
		//1. 4가지 정보
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid="scott";
		String passwd = "tiger";
		
		//2.
		Connection con = null;
		Statement stmt = null;
		
		
		//3.
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userid, passwd);
			
		//4.
//			String dname= "영업";
//			String loc= "제주도";
//			int deptno =90;
//			String sql ="update dept set dname='"+dname+"', loc='"+loc+"'"+"where deptno ="+deptno;
//			stmt = con.createStatement();
			
			String sql2 ="delete from dept where deptno=90"; 
			stmt =con.createStatement();
			
			
			//5. 실행해서 결과받기
			int num = stmt.executeUpdate(sql2);
			System.out.println("실행된 레코드 갯수:" + num);
			System.out.println(sql2);
			
//			String sql2 = "select dname,loc,deptno from dept";
//			ResultSet rs = null;
//			rs = stmt.executeQuery(sql2);
//			System.out.println(sql2);
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
//			}
			
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (SQLException e) {
			 	e.printStackTrace();
			}finally {
				try {
					if(stmt!=null) stmt.close();
					if(con!=null)con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
	}
	}

}
