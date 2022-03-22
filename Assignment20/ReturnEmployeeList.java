package Assignment20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReturnEmployeeList 
{
	
	public ArrayList<Employee> returnEmployee()
	{
		ArrayList <Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101, "ganesh", "shirdi"));
		al.add(new Employee(102, "hemant", "ahmednagar"));
		al.add(new Employee(103, "sarthak", "pune"));
		al.add(new Employee(104, "sanket", "shrirampur"));
		
		return al; 
		
		
	}
	public static void main(String[] args) 
	{
		ReturnEmployeeList returnEmployeeList = new ReturnEmployeeList();
		ArrayList<Employee> arrayList=returnEmployeeList.returnEmployee();

		System.out.println("Employee Details : ");
		System.out.println("---------------------------------------------------------");
		for(Employee employee : arrayList)
		{
			System.out.println(employee);
		}
	}

}
