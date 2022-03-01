package Assignment15;

import java.util.Scanner;

public class AccountDetails 
{
	public void getAccountDetails()
	{
		Account savingAccount=new SavingAccount();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Account id : ");
		savingAccount.id=scanner.nextInt();
		System.out.println("Enter Account Number : ");
		savingAccount.accountNumber=scanner.nextLong();
		System.out.println("Enter Account Balance : ");
		savingAccount.balance=scanner.nextDouble();
		long withdrawAmmount=AccountDetails.withdrawDetails(savingAccount);
		System.out.println("Withdraw Amount is : "+withdrawAmmount);
		System.out.println("Total Balance : "+savingAccount.balance);
	}
	public static long withdrawDetails(Account account)
	{
		long amt=SavingAccount.withdrawAmmount();
		account.balance=account.balance-amt;
		return amt;
	}
	
	 public static void main(String[] args)
	 {
		 AccountDetails details=new AccountDetails();
		 details.getAccountDetails();
	 }
}
