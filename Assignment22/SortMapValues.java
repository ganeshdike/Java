package Assignment22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapValues
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
		hashMap.put("Ram", 3);hashMap.put("Sohan", 2);
		hashMap.put("Ashok", 1);hashMap.put("Ajay", 6);
		hashMap.put("Prasanna", 5);
		System.out.println("Before Swap : "+hashMap);
		
		
		List<Map.Entry<String,Integer>> list=new ArrayList<Map.Entry<String,Integer>>(hashMap.entrySet());
		//List<Map.Entry<String,Integer>> list=new ArrayList<>(hashMap.entrySet()); 
		//optional
		
		list.sort(Entry.comparingByValue());
		
		System.out.println("After Swapping :"+list);
	}
}
