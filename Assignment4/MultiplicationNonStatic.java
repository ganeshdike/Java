package Assignment4;

public class MultiplicationNonStatic 
{
	public int iFirst;
	public int iSecond;
	
	public static void main(String[] args) 
	{
		MultiplicationNonStatic object=new MultiplicationNonStatic();
		object.iFirst=10;
		object.iSecond=20;
		
		int iResult=object.multiplication(object.iSecond,object.iFirst);
		System.out.println(iResult);
	}
	
	public int multiplication(int a,int b)
	{
		return (a*b);
	}
}
