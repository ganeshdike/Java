package Assignment24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain 
{

	public static void main(String[] args)
	{
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1, "ganesh", 90000.00));
		list.add(new Student(2, "sarthak", 35000.00));
		list.add(new Student(3, "hemant", 40000.00));
		list.add(new Student(4, "sagar", 95000.00));
		
		System.out.println("Before Swap : "+ list);
		Collections.sort(list, new StudentComparator());
		System.out.println("\n\nAfter Swap : "+ list);
			
	}
	
}
