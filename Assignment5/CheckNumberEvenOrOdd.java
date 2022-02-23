package Assignment5;

public class CheckNumberEvenOrOdd 
{
	public boolean checkNumber(int num)
	{
		if(num%2==0)
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
		int iNumber=134;
		
		CheckNumberEvenOrOdd checkNumberEvenOrOdd=new CheckNumberEvenOrOdd();
		boolean returnVal=checkNumberEvenOrOdd.checkNumber(iNumber);
		if(returnVal)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}
