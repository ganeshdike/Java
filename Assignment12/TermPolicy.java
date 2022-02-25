package Assignment12;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance
{
	int duration;
	
	public void setTermPolicyDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Duration :");
		duration=scanner.nextInt();
	}
	
	public void getTermPolicyInformetion()
	{
		System.out.println("Duration ="+duration);
	}
	
}
