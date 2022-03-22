package Assignment20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GenericArrayList
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("pune");
		al.add("Ahmednagr");
		al.add("baramati");
		al.add("shirdi");
		al.add("shrirampur");
		
		for(String str : al)
		{
			System.out.println(str);
		}
	}

}
