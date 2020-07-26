package shastri.swaroop.cisco;

import java.sql.Connection;

public interface ConnectionPool {

	public Connection getConnection();
	public boolean removeConnection(Connection con);
	public String getUrl();
	public String getUser();
	public String getPassword();
}
