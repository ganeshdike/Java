package Assignment20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveElementArrayList
{
	public ArrayList<String> al;
	
	public void removeElement()
	{
		int iLimit;
		String str;
		Scanner scanner=new Scanner(System.in);
		al=new ArrayList<String>();
		
		System.out.println("How many element enter in Array List :");
		iLimit=scanner.nextInt();
		scanner.nextLine();
		for(int i=1;i<=iLimit;i++)
		{
			System.out.print("\nEnter "+i+" element : ");
			str=scanner.nextLine();
			al.add(str);
		}
		System.out.println("Array List is : "+al);
		System.out.println("which element do you wan't to remove");
		String remove=scanner.nextLine();
		al.remove(remove);
		System.out.println("After Removing List is : "+al);
	}
	public static void main(String[] args) 
	{
		RemoveElementArrayList removeElementArrayList = new RemoveElementArrayList();
		removeElementArrayList.removeElement();
	}

}
