import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PStatement4 {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver"; //6_g.jav파일의 api로딩경로
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott"; //계정명
		String passwd = "tiger"; //비밀번호
		
		Connection con= null; // 데이터베이스와 연결정보를 저장하는 객체
		PreparedStatement pstmt=null; // sql문을 담고 요청할 수 있는 객체
		ResultSet rs =null; // 결과데이터를 저장하는 객체
		
		try {
			Class.forName(driver); // driver 객체의 속성들을 가져옴
			
			con = DriverManager.getConnection(url, userid, passwd); //driver를 통해 연결정보를 가져와서 con에 저장
			
			String sql = "select deptno from dept where dname = ? or dname = ? ";  //요청할 sql문 작성
			pstmt =con.prepareStatement(sql); // sql문을 객체에 저장
			pstmt.setString(1, "영업"); //sql문 1번 물음표에 영업이라는 문자열 치환
			pstmt.setString(2, "개발"); //sql문 2번 물음표에 개발이라는 문자열 치환
			rs = pstmt.executeQuery(); //sql문 객체를 통해 요청을 수행하고 결과 데이터를 객체에 저장
			while(rs.next()) { // 다음 행의 데이터 불러오기 다음 행의 데이터가 없으면  false를 반환하고 반복문 종료
				System.out.println(rs.getInt(1)); //데이터의 1번째 컬럼출력
			}
			
			System.out.println();
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
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
