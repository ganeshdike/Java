package Assignment4;


public class MultiplicationStaticMethod
{
	public static int iFirst;
	public static int iSecond;
	
	public static void main(String[] args) 
	{
		MultiplicationStaticMethod.iFirst=10;
		MultiplicationStaticMethod.iSecond=20;
		
		int iResult=MultiplicationStaticMethod.multiplication(iFirst,iFirst);
		System.out.println(iResult);
	}
	
	public static int multiplication(int a,int b)
	{
		return (a*b);
	}
}
