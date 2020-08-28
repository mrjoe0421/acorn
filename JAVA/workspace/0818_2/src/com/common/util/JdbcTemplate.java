

package com.common.util;

import java.sql.*;


public class JdbcTemplate {//드라이버 로딩 및 db연결, con 리턴, con.close()
//

	public static String driver="oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static String userid = "scott";
	public static String passwd = "tiger";
	
	public JdbcTemplate()  {
		//드라이버로딩
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("드라이버 로딩");
	}
    /**
     * Connection을 연결한 후 멤버 attribute 인 conn 에 Connection 객체를 세팅한 후 리턴한다.
     * 
     * @return Connection
     */
    public static Connection getConnection() {
    	//db 연결, 연결된 con 리턴
       // connect연결 후 tx(트랜잭션)를 false로 설정 리턴 
    	Connection conn = null;
    	try {
    		conn = DriverManager.getConnection(url,userid,passwd);
    		conn.setAutoCommit(false);//수정 후 리턴
		} catch (Exception e) {
			System.out.println("[JdbcTemplate.getConnection]" + e.getMessage());
			e.printStackTrace();
		}
        return conn;//connection 리턴
    }

    /**
     * DB와 Connect되었는지 여부를 Return 한다.
     * 
     * @return DB와 Connect 되었는지 여부.
     */
    public static boolean isConnected(Connection conn) {

        boolean validConnection = true;
        try {
			if(conn==null ||conn.isClosed())
				validConnection = false;
		} catch (Exception e) {
			validConnection = false;
			e.printStackTrace();
		}
//conn 이 null 이거나   conn.isClose()가 참이면  validConnection을 false 로 설정 
        return validConnection;
    }

    /**
     * Connection 객체를 시스템에 반환한다.
     * @throws SQLException 
     */
    public static void close(Connection conn) throws SQLException {
    	try {
			if(conn!=null)
				conn.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
      // isConnected()이용 검사후 close
    }

    /**
     * Statement를 Close 한다.
     * 
     * @param stmt
     *            Statement 객체.
     * @throws SQLException 
     */
    public static void close(PreparedStatement pstmt) throws SQLException {
    	try {
			if(pstmt!=null)
				pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    //dao에서 pstmt를 넘겨줘서    //pstmt close()  //try-catch 처리
    }

    /**
     * ResultSet을 Close 한다.
     * 
     * @param result
     *            ResultSet 객체.
     */
    public static void close(ResultSet rset) {
    	
    	try {
			if(rset!=null)
				rset.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
      //rset close - try-catch 처리
    }

    /**
     * 지금까지의 트랜잭션을 Commit 처리한다.
     */
    public static void commit(Connection conn) {

        try {
            if (isConnected(conn)) {
                conn.commit();
                System.out.println("[JdbcTemplate.commit] : DB Successfully Committed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 지금까지의 트랜잭션을 Rollback 처한다.
     */
    public static void rollback(Connection conn) {

        try {
            if (isConnected(conn)) {
                conn.rollback();
                System.out.println("[JdbcTemplate.rollback] : DB Successfully Rollbacked!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
