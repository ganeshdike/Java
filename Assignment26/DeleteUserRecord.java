package Assignment26;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteUserRecord
{
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	
	public void deleteRecord(int id)
	{
		try 
		{
			ConnectionTest test=new ConnectionTest();
			
			connection=test.getConnectionDetails();
			
			String query="delete from user where id=?";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Record Deleted where id is "+id);
	}
}
