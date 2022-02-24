package Assignment8;

import java.util.Scanner;
public class Employee 
{
	String firstName;
	String lastName;
	String city;
	static String country="India";
	long mobileNumber;
	
	public void empDetails(Employee emp)
	{
		System.out.println(emp.firstName+"\t\t"+emp.lastName+"\t\t"+emp.city+"\t\t"+Employee.country+"\t\t"+emp.mobileNumber);
	}
	public void getUserInput(Employee emp)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Name:");
		emp.firstName=scanner.nextLine();
		System.out.println("Enter Last Name:");
		emp.lastName=scanner.nextLine();
		System.out.println("Enter City Name:");
		emp.city=scanner.nextLine();
		System.out.println("Enter Mobile Number:");
		emp.mobileNumber=scanner.nextLong();

	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Noumber of Student You Enter Data:");
		int numOfStud=scanner.nextInt();
		
		Employee employee[]=new Employee[2];
				
		for(int i=0;i<numOfStud;i++)
		{
			employee[i]=new Employee();
			System.out.println("Enter "+(i+1)+" Employe Details....");
			employee[i].getUserInput(employee[i]);
		}
		
		System.out.println("Employee Details....");
		System.out.println("*********************************************************************************");
		System.out.println("First Name\t lastName \t city \t\t country \t MobileNumber");
		System.out.println("*********************************************************************************");
		
		for(int i=0;i<numOfStud;i++)
		{
			employee[i].empDetails(employee[i]);
		}
		System.out.println("*********************************************************************************");
		
	}

}
