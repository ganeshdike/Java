package Assignment12;

import java.util.Scanner;

public class HDFCBank extends Bank
{
	public double getCalculateInterest(double principleAmount,int tenure,float rateOfInterest)
	{
		return(principleAmount*rateOfInterest*tenure)/100;
	}
	public void getHDFCBankDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Principle Amount :");
		principleAmount=scanner.nextDouble();
		
		System.out.println("Enter tenure :");
		tenure=scanner.nextInt();
		System.out.println("Enter Rate Of Interest :");
		rateOfInterest=scanner.nextFloat();
		
		System.out.println("*************HDFC Bank Details****************");
		System.out.println("principleAmount :"+principleAmount);
		System.out.println("tenure :"+tenure);
		System.out.println("rateOfInterest :"+rateOfInterest);
	}
}
