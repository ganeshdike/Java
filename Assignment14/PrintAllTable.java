package Assignment14;

public class PrintAllTable
{
	public static void main(String[] args) 
	{
		for(int i=2;i<=20;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("\t"+i*j);
			}
			System.out.println("\n");
		}
	}
}
