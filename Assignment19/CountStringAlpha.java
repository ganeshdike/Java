package Assignment19;

import java.util.Scanner;

public class CountStringAlpha 
{
	public int countAlphabet(String str)
	{
		char ch;
		int iCount=0;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if((ch<='z')&&(ch>='a')||(ch<='Z')&&(ch>='A'))
			{
				iCount++;
			}			
		}
		return iCount;
	}
	public int countVowels(String str)
	{
		char ch;
		int iCount=0;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
			{
				iCount++;
			}			
		}
		return iCount;
	}
	public int countNumber(String str)
	{
		char ch;
		int iCount=0;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if((ch>='0')&&(ch<='9'))
			{
				iCount++;
			}			
		}
		return iCount;
	}
	public static void main(String[] args) 
	{
		CountStringAlpha object=new CountStringAlpha();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=scanner.nextLine();
		System.out.println("Alphabet = "+ object.countAlphabet(str));
		System.out.println("Vowels = " + object.countVowels(str));
		System.out.println("Number = "+object.countNumber(str));
	}

}
