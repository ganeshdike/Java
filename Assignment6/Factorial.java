package Assignment6;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int iNum=5;
		int iFact=1;
		for(int i=1;i<=iNum;i++)
		{
			iFact=iFact*i;
		}
		System.out.println("Factorial="+iFact);
	}

}
