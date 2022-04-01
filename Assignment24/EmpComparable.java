package Assignment24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpComparable
{
	public static void main(String[] args)
	{
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, "ganesh", "pune"));
		list.add(new Employee(102, "ashok", "Mumbai"));
		list.add(new Employee(103, "hemant", "satara"));
		list.add(new Employee(104, "sarthak", "Ahamednagar"));
		
		System.out.println("Before Swap : "+list);
		Collections.sort(list);
		System.out.println("\n\nAfter Swap : "+list);
	}
}
