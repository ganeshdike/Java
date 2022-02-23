package Assignment5;

public class SquareNumber
{
	public int squareNumber(int num)
	{
		
			return  num*num;
	}
	
	public static void main(String[] args)
	{
		int iNumber=3;
		
		SquareNumber number=new SquareNumber();
		int returnVal=number.squareNumber(iNumber);
		System.out.println(iNumber+" Square is="+returnVal);
		
		
	}
}
