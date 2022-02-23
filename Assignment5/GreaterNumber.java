package Assignment5;

public class GreaterNumber 
{
	public void greaterNumber(int num)
	{
		if(num>100)
		{
			System.out.println(num+" Number is Greater 100");
		}
		else
		{
			System.out.println(num+" Number not Greater 100");
		}
			
	}
	
	public static void main(String[] args)
	{
		int iNumber=10;
		
		GreaterNumber number=new GreaterNumber();
		number.greaterNumber(iNumber);
		
		
	}
}
