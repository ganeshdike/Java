package Assignment26;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest 
{
	Connection connection=null;
	public Connection getConnectionDetails()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return connection;
	}
}
