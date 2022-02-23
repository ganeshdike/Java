package Assignment4;

public class AdditionNonStatic
{
	public int iFirst;
	public int iSecond;
	
	public static void main(String[] args) 
	{
		AdditionNonStatic object=new AdditionNonStatic();
		object.iFirst=10;
		object.iSecond=20;
		
		int iResult=object.addition(object.iSecond,object.iFirst);
		System.out.println(iResult);
	}
	
	public int addition(int a,int b)
	{
		return (a+b);
	}
}
