package Assignment12;

import java.util.Scanner;

public class SBIBank extends Bank
{
	public double getCalculateInterest(double principleAmount,int tenure,float rateOfInterest)
	{
		return(principleAmount*rateOfInterest*tenure)/100;
	}
	public void getSBIBankDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Principle Amount :");
		principleAmount=scanner.nextDouble();
		
		System.out.println("Enter tenure :");
		tenure=scanner.nextInt();
		System.out.println("Enter Rate Of Interest :");
		rateOfInterest=scanner.nextFloat();
		
		System.out.println("*************SBI Bank Details****************");
		System.out.println("principleAmount :"+principleAmount);
		System.out.println("tenure :"+tenure);
		System.out.println("rateOfInterest :"+rateOfInterest);
	}
}
