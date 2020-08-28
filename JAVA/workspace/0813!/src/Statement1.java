import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Statement1 {

	public static void main(String[] args) {
		//1. 4가지 정보
		String driver = "oracle.jdbc.driver.OracleDriver"; //6_g.jav파일의 api로딩경로
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userid = "scott"; //계정명
		String passwd = "tiger"; //비밀번호
		
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//2. dname이 개발 또는 영업인 부서의 deptno 출력
			//드라이브 구동
			Class.forName(driver);
			//오라클연결
			con =  DriverManager.getConnection(url,userid,passwd);
			//sql 작성
			String sql = "select deptno from dept where  dname=? or dname=?";
			//sql 실행준비
			pstmt = con.prepareStatement(sql);
			//statement를 이용 실행해서 결과받기
			pstmt.setString(1, "영업");
			pstmt.setString(2, "개발");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt(1);
				System.out.println(deptno);
			}	
			
				System.out.println();	
				System.out.println();	
			//3.deptno를 오름차순으로 정렬, 모든 자료 출력
				String sql2 = "select * from dept order by deptno asc ";
				pstmt = con.prepareStatement(sql2);
				rs = pstmt.executeQuery();
				while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
					System.out.println(deptno+"\t"+dname+"\t"+loc);
				}
				
				System.out.println();
				System.out.println();
			//4.부서번호가 20이상인 부서의 지역
				String sql3 = "select loc from dept where deptno >= 20";
				pstmt = con.prepareStatement(sql3);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					String loc = rs.getString(1);
					System.out.println(loc);
					
				}
				System.out.println();
				System.out.println();
				//5. 부서이름이 A로 시작하는 부서 이름과 지역 출력
				String sql4 = "select dname, loc from dept where dname like ?";
				pstmt = con.prepareStatement(sql4);
				pstmt.setString(1, "A%");
				rs = pstmt.executeQuery();
				while(rs.next()) {
					String dname = rs.getString(1);
					String loc = rs.getString(2);
					System.out.println(dname +"\t"+ loc);
					System.out.println();
				}
				System.out.println();
				System.out.println();
				//6.부서번호가 제일 높은 부서의 이름 출력
				String sql5 = "select dname from dept where deptno = (select MAX(deptno) from dept) ";
				pstmt = con.prepareStatement(sql5);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					String dname = rs.getString(1);
					System.out.println(dname);
				}
				//7. 부선번호 99, 개발, 서울 추가 후 지역을 제주로 변경
				String sql6 = "insert into dept(deptno,dname,loc) "+ "values(?,?,?) ";
				pstmt =con.prepareStatement(sql6);
				
				pstmt.setInt(1, 99);
				pstmt.setString(2, "개발");
				pstmt.setString(3, "서울");
				rs=pstmt.executeQuery();
				
				String sql7 = "update dept set loc = ? where deptno=99";
				pstmt = con.prepareStatement(sql7);
				pstmt.setString(1, "제주");
				rs=pstmt.executeQuery();
				
				String sql8 = "select deptno,loc from dept where deptno = 99";
				pstmt = con.prepareStatement(sql8);
				rs=pstmt.executeQuery();
				
				while(rs.next()) {
					int deptno = rs.getInt(1);
					String dname = rs.getString(2);
					System.out.println(deptno+"\t"+dname);
				}
				
	
			}catch(Exception e) {
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