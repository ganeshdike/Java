package Assignment4;

public class SubstractionStaticMethod
{
	public static int iFirst;
	public static int iSecond;
	
	public static void main(String[] args) 
	{
		SubstractionStaticMethod.iFirst=10;
		SubstractionStaticMethod.iSecond=20;
		
		int iResult=SubstractionStaticMethod.substraction(iSecond, iSecond);
		System.out.println(iResult);
	}
	
	public static int substraction(int a,int b)
	{
		return (a-b);
	}
}
