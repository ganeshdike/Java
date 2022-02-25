package Assignment12;

import java.util.Scanner;

public class LifeInsurance extends Insurance
{
	int premiumAmount;
	
	public void setLifeInsuranceDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Premium Amount");
		premiumAmount=scanner.nextInt();
	}
	public void getLifeInsuranceInformation()
	{
		System.out.println("Premium Amount is ="+premiumAmount);
	}
}
