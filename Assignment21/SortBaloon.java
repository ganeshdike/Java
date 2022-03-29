package Assignment21;

import java.util.ArrayList;

public class SortBaloon 
{

	public static void main(String[] args) 
	{
		ArrayList<String> listRed=new ArrayList<String>();
		ArrayList<String> listBlue=new ArrayList<String>();
		ArrayList<String> listGreen=new ArrayList<String>();
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Red");arrayList.add("Blue");
		arrayList.add("Green");arrayList.add("Red");
		arrayList.add("Blue");arrayList.add("Red");
		arrayList.add("Blue");arrayList.add("Green");
		System.out.println("Array List is : "+arrayList);
		for(String str : arrayList)
		{
			if(str.equals("Red"))
			{
				listRed.add(str);
			}
			else if(str.equals("Blue"))
			{
				listBlue.add(str);
			}
			else
			{
				listGreen.add(str);
			}
		}
		arrayList.clear();
		arrayList.addAll(listRed);
		arrayList.addAll(listBlue);
		arrayList.addAll(listGreen);
		
		System.out.println("\n\nSort List is : "+arrayList);
		
	}

}
