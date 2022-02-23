package Assignment4;

public class AdditionStaticMethod 
{
	public static int iFirst;
	public static int iSecond;
	
	public static void main(String[] args) 
	{
		AdditionStaticMethod.iFirst=10;
		AdditionStaticMethod.iSecond=20;
		
		int iResult=AdditionStaticMethod.addition(iFirst, iSecond);
		System.out.println(iResult);
	}
	
	public static int addition(int a,int b)
	{
		return a+b;
	}

}
