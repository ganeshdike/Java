package Assignment7;

import java.util.Scanner;

public class CheckCharacter
{
	private char ch;
	public void checkChar(char c)
	{
		if((c>='0')&&(c<='9'))
		{
			System.out.println(c+" is Digit");
		}
		else if((c>='a')&&(c<='z'))
		{
			System.out.println(c+" is alphabet");
		}
		else
		{
			System.out.println(c+" is Special Charecter");
		}
	}

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		CheckCharacter character=new CheckCharacter();
		
		System.out.print("Enter Character: ");
		character.ch=scanner.next().charAt(0);
		character.checkChar(character.ch);;
	}

}
