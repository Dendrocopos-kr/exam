import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDAO {
	private static OracleDAO temp;
	private OracleDAO() {}
	public static OracleDAO getInstance() {
		if (temp == null) {
			temp = new OracleDAO();
			return temp;
		}
		return temp;
	}
	
	public Connection getConn() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "hr";
		String password = "1234";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, userName, password);
		return conn;
	}
	
	public void closeConn(Connection conn) {
		if( conn != null ) {
			try {
				conn.close();
			}catch(Exception e) {}
		}		
	}
}
