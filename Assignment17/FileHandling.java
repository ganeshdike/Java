package Assignment17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class FileHandling 
{
	public static void main(String[] args) 
	{
		int iVowels=0 ;
		int iNum=0;
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\DIKE GANESH\\Desktop\\Demo.txt");
			Scanner scanner=new Scanner(fis);
			System.out.print("File Containt is =");
			while(scanner.hasNextLine())
			{
				String str=scanner.nextLine();
				System.err.println(str);
				for(int i=0;i<str.length();i++)
				{
					char ch=str.charAt(i);
					if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
					{
						iVowels++;
					}
					else if((ch<='9')&&(ch>='0'))
					{
						iNum++;
					}
				}
								
			}
			System.out.println("\n\n\nNumber Of Vowels = "+iVowels);
			System.out.println("Number = "+iNum);
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File Not Open...");
		}
	}
}
 