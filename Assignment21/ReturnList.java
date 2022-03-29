package Assignment21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReturnList 
{
	public List<String> returnList()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sohan");
		list.add("Ashok");
		list.add("Ajay");
		list.add("Prasanna");
		System.out.println("Before Sort : "+ list);
		Collections.sort(list,Collections.reverseOrder());
		return list;
	}
	public static void main(String[] args) 
	{
		ReturnList returnList = new ReturnList();
		System.out.println("After Sort : "+returnList.returnList());
	}

}
