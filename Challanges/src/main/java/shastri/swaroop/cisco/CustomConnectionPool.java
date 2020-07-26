package shastri.swaroop.cisco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// https://www.baeldung.com/java-connection-pooling
public class CustomConnectionPool implements ConnectionPool {
	String url;
	String user;
	String password;
	private static final int INITIAL_POOL_SIZE = 10;
//	int usedConnections = 0;
	private List<Connection> usedConnections = new ArrayList<Connection>();
	private List<Connection> connectionPool ;
	
	public CustomConnectionPool(String url, String user, String passwd, List<Connection> pool){
		this.url = url;
		this.user = user;
		this.password = passwd;	
		this.connectionPool = pool;
	}

	private static CustomConnectionPool createConnectionPool(String url, String user,String  password) throws SQLException {
		List<Connection> pool = new ArrayList<Connection>(INITIAL_POOL_SIZE);
		for(int i=0; i<INITIAL_POOL_SIZE; i++) {
			pool.add(createConnection(url, user, password));
		}
		return new CustomConnectionPool(url, user, password, pool);
	}
	private static Connection createConnection(
			String url, String user, String password) 
			throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	
	public Connection getConnection() {
		// TODO Auto-generated method stub
		int used = usedConnections.size();
		if(used>0 && used <=10) {
			Connection conn = connectionPool.get(connectionPool.size()-used);
			connectionPool.remove(conn);
			usedConnections.add(conn);
			return conn;
		} 
		System.out.println("No connections left");
		return null;
	}
	
	public boolean removeConnection(Connection con) {
		if(con!=null) {
			connectionPool.add(con);
			usedConnections.remove(con);
			return true;
		}
		System.out.println("Connection is null");
		return false;
	}

	public String getUrl() {
		// TODO Auto-generated method stub
		return this.url;
	}

	public String getUser() {
		// TODO Auto-generated method stub
		return this.user;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

}
