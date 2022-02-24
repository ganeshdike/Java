package Assignment7;

import java.util.Scanner;

public class ReverseNumber
{
	private int iNum;
	public int getReverseNumber(int num)
	{
		int rev=0;
		int temp;
		for(int i=num;i!=0;i=i/10)
		{
			temp=i%10;
			rev=rev*10+temp;
		}
		return rev;
	}
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		ReverseNumber reverseNumber=new ReverseNumber();
		System.out.println("Enter The Number ");
		reverseNumber.iNum=scanner.nextInt();
		
		System.out.print("Number is "+reverseNumber.iNum);
		int iResult=reverseNumber.getReverseNumber(reverseNumber.iNum);
		System.out.println(" Reverse Number is::"+iResult);
	}

}
