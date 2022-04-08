package Assignment26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sound.midi.Soundbank;

public class ReadDataFromUser
{
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	
	public void getDataFromUser()
	{
		try 
		{
			ConnectionTest connectionTest=new ConnectionTest();
			connection=connectionTest.getConnectionDetails();
			String query="select * from user";
			preparedStatement=connection.prepareStatement(query);
			
			ResultSet resultSet=preparedStatement.executeQuery();
			System.out.println("id\tFirstName\tLastName\tcity\tMobilNo");
			System.out.println("----------------------------------------------------------------");
			while(resultSet.next())
			{
				System.out.print(resultSet.getInt(1)+"\t"+resultSet.getString(2)
								+"\t\t"+resultSet.getString(3)+"\t\t"+resultSet.getString(4)
									+"\t"+resultSet.getLong(5)+"\n");
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
