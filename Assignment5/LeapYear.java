package Assignment5;

public class LeapYear 
{
	public boolean checkLeapYear(int year)
	{
		if(year%2==0)
		{
			return true;
		}
		else
		{
			return  false;
		}
	}
	public static void main(String[] args)
	{
		int iNumber=2023;
		
		LeapYear leapYear=new LeapYear();
		boolean returnVal=leapYear.checkLeapYear(iNumber);
		if(returnVal)
		{
			System.out.println(iNumber+" is Leap Year");
		}
		else
		{
			System.out.println(iNumber+" is Not Leap Year");
		}	
	}

}
