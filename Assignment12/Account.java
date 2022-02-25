package Assignment12;

import java.util.Scanner;

public class Account 
{
	int accountNumber;
	String accountName;
	
	public void setAccountDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Account Number :");
		accountNumber=scanner.nextInt();
		
		System.out.println("Enter Account Name : ");
		scanner.nextLine();
		accountName=scanner.nextLine();
		
	}
	public void getAccountInformetion()
	{
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Name :"+accountName);
	}
}
