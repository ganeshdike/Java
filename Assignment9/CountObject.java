package Assignment9;

import java.util.Scanner;

public class CountObject 
{	public static int iCount=0;
		
	CountObject()
	{
		iCount++;
	}	

	public static void main(String[] args) 
	{
				
		CountObject countObject1=new CountObject();
		CountObject countObject2=new CountObject();
		CountObject countObject3=new CountObject();
		CountObject countObject4=new CountObject();
		
		System.out.println("Object Count is "+CountObject.iCount);
	}

}
