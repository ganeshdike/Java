package Assignment10;

import java.util.Scanner;

public class FibonacciSeries
{
	public static void main(String[] args)
	{
		int num,temp1=0,temp2=1,result=0; 
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Length to print Fibonacci Series");
		
		num=scanner.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.print(temp1+" ");
			result=temp1+temp2;
			temp1=temp2;
			temp2=result;
		}
		
	}

}
