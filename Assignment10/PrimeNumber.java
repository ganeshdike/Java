package Assignment10;

import java.util.Scanner;

public class PrimeNumber 
{
	public boolean checkNumPrime(int num)
	{
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
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
		
		PrimeNumber number=new PrimeNumber();
		boolean result=number.checkNumPrime(num);
		if(result)
		{
			System.out.println(num+" is prime");
		}
		else
		{
			System.out.println(num+" is not prime");
		}
	}

}
