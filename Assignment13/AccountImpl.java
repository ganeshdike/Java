package Assignment13;

import java.util.Scanner;

public class AccountImpl implements Account
{
	String name;
	float balance;
	@Override
	public void getSavingAccount()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name :");
		name=scanner.nextLine();
		System.out.println("Enter Balance");
		balance=scanner.nextFloat();
	}
	@Override
	public void getUserDetails(String name, float balance) 
	{
		System.out.println("************User Details*************");
		System.out.println("User Name : "+name);
		System.out.println("User Account Balance : "+balance);
	}
	
}
