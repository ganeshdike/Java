package Assignment26;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertRecordUser 
{
	Connection connection = null;
	PreparedStatement preparedStatement = null;

	public void insertRecord(UserEntityClass user) 
	{
		int returnVAl=0; 
		try
		{
			ConnectionTest test = new ConnectionTest();
			connection = test.getConnectionDetails();
			String query = "insert into user(firstName,lastName,city,mobileNo)values(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getCity());
			preparedStatement.setLong(4,user.getMobileNo());
			returnVAl=preparedStatement.executeUpdate();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		System.out.println(returnVAl+" Record inserted ");
	}
}
