package Assignment26;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpadateRecordUser 
{
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	
	public void updateRecord(int id,UserEntityClass user)
	{
		try
		{
			
			ConnectionTest test=new ConnectionTest();
			connection=test.getConnectionDetails();
			
			String query="update user set mobileNo=? where id=?";
			preparedStatement=connection.prepareStatement(query);
			
			preparedStatement.setLong(1, user.getMobileNo());
			preparedStatement.setInt(2, id);
			preparedStatement.executeUpdate();
			
			System.out.println("Record Updated where id is "+id);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
