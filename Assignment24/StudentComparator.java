package Assignment24;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>
{

	@Override
	public int compare(Student emp1, Student emp2)
	{
		if(emp1.getSalary()==emp2.getSalary())
		{
			return 0;
		}
		else if(emp1.getSalary()>emp2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
