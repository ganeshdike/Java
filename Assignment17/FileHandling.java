package Assignment17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class FileHandling 
{
	public static void main(String[] args) 
	{
		int iVowels=0;
		int iNum=0;
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\DIKE GANESH\\Desktop\\Demo.txt");
			Scanner scanner=new Scanner(fis);
			System.out.print("File Containt is =");
			while(scanner.hasNextLine())
			{
				String str=scanner.nextLine();
				System.err.print(" "+str);
				if(str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u"))
				{
					iVowels++;
				}
				else if(str.equals("0")||str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")||str.equals("5")||str.equals("6")||str.equals("7")||str.equals("8")||str.equals("9"))
				{
					iNum++;
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
 