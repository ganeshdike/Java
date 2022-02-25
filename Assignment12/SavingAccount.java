package Assignment12;

import java.util.Scanner;

public class SavingAccount extends Account
{
	String accountType;
	long balance;
	
	public void setSavingAccountDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Account Type :");
		accountType=scanner.nextLine();
		System.out.println("Enter Balance :");
		balance=scanner.nextLong();
	}
	public void getSavingAccountInformation()
	{
		System.out.println("Account type :"+accountType);
		System.out.println("Balance :"+balance);
	}
}
