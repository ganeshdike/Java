package Assignment19;

import java.util.Scanner;

public class ReverseString 
{
	public String getReverse(String str)
	{
		char ch;
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			temp=ch+temp;			
		}
		return temp;

	}

	public static void main(String[] args) 
	{
		ReverseString objet=new ReverseString();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter String :");
		String str=scanner.nextLine();
		System.out.println("Reverse String is : "+ objet.getReverse(str));
		
	}

}
