package Assignment5;

public class CheckNumber
{
	public boolean checkNumber(int num)
	{
		if(num>=0)
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
		int iNumber=0;
		
		CheckNumber checkNumber=new CheckNumber();
		boolean returnVal=checkNumber.checkNumber(iNumber);
		if(returnVal)
		{
			System.out.println("Number is Positive");
		}
		else
		{
			System.out.println("Number is Negative");
		}
	}
}
