package Assignment4;

public class DivisionStaticMethod 
{
	public static int iFirst;
	public static int iSecond;
	
	public static void main(String[] args) 
	{
		DivisionStaticMethod.iFirst=10;
		DivisionStaticMethod.iSecond=20;
		
		int iResult=DivisionStaticMethod.division(iSecond,iFirst);
		System.out.println(iResult);
	}
	
	public static int division(int a,int b)
	{
		return (a/b);
	}
}
