package Assignment15;

import java.util.Scanner;

public class SavingAccount extends Account 
{
	public static long withdrawAmmount()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Amount to withdraw : ");
		long withdrawAmt=scanner.nextLong();
		return withdrawAmt;
	}
}
