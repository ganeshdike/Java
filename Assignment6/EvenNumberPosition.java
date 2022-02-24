package Assignment6;

public class EvenNumberPosition 
{

	public static void main(String[] args) 
	{
		int iFirstPos=50;
		int iSecondPos=75;
		
		for(int i=iFirstPos;i<=iSecondPos;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
