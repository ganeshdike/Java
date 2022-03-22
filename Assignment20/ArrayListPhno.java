package Assignment20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListPhno
{
	public ArrayList<Long> al;
	
	public void addPhnoAndIterate()
	{
		int iLimit;
		long iPhno;
		Scanner scanner=new Scanner(System.in);
		al=new ArrayList<Long>();
		
		System.out.println("How many element enter in Array List :");
		iLimit=scanner.nextInt();
		
		for(int i=1;i<=iLimit;i++)
		{
			System.out.print("\nEnter "+i+" element : ");
			iPhno=scanner.nextLong();
			al.add(iPhno);
		}
		
		Iterator<Long> it=al.iterator();
		System.out.println("\nArrayList Element is : ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) 
	{
		ArrayListPhno arrayListPhno = new ArrayListPhno();
		arrayListPhno.addPhnoAndIterate();
	}

}
