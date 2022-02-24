package Assignment10;

import java.util.Scanner;

public class Armstrong
{
	public boolean calArmstron(int num)
	{
		int result=0;
		int temp=0,temp2=num;
		while(num!=0)
		{
			temp=num%10;
			result=result+(temp*temp*temp);
			num=num/10;
		}
		if(temp2==result)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scanner.nextInt();
		Armstrong armstrong=new Armstrong();
		boolean result=armstrong.calArmstron(num);
		if(result)
		{
			System.out.println(num+" is Armstrong");
		}
		else
		{
			System.out.println(num+" is not Armstrong");
		}
	}
}
