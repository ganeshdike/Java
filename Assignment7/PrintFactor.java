package Assignment7;

import java.util.Scanner;

public class PrintFactor
{
	private int iNum;
	public void getNumberFact(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(" "+i);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		PrintFactor printFactor=new PrintFactor();
		
		System.out.println("Enter The Number ");
		printFactor.iNum=scanner.nextInt();
		System.out.print(printFactor.iNum+" Factor is ");
		printFactor.getNumberFact(printFactor.iNum);
		
	}

}
