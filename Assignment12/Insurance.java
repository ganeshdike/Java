package Assignment12;

import java.util.Scanner;

public class Insurance 
{
	int id;
	String personName;
	String insuranceCompany;
	
	public void setInsuranceDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id :");
		id=scanner.nextInt();
		
		System.out.println("Enter Name :");
		scanner.nextLine();
		personName=scanner.nextLine();
		
		System.out.println("Enter Company name :");
		insuranceCompany=scanner.nextLine();
	}
	public void getInsuranceInformation()
	{
		System.out.println("Id ="+id);
		System.out.println("Person Name ="+personName);
		System.out.println("Insurance Company Name ="+insuranceCompany);
	}
}
