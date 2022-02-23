package Assignment4;

public class SubstractionNonStatic 
{
	public int iFirst;
	public int iSecond;
	
	public static void main(String[] args) 
	{
		SubstractionNonStatic object=new SubstractionNonStatic();
		object.iFirst=10;
		object.iSecond=20;
		
		int iResult=object.substraction(object.iSecond,object.iFirst);
		System.out.println(iResult);
	}
	
	public int substraction(int a,int b)
	{
		return (a-b);
	}
}
