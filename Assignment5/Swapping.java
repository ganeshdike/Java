package Assignment5;

public class Swapping
{
	private static int iFirst;
	private static int iSecond;
	
	public void SwapNumber()
	{
		int iTemp;
		iTemp=Swapping.iFirst;
		Swapping.iFirst=Swapping.iSecond;
		Swapping.iSecond=iTemp;
	}
	
	public static void main(String[] args)
	{
		Swapping swapping=new Swapping();
		Swapping.iFirst=123;
		Swapping.iSecond=456;
		System.out.println("Before Swappin FirstNumber="+iFirst+" Second Number="+iSecond);
		swapping.SwapNumber();
		System.out.println("After Swappin FirstNumber="+iFirst+" Second Number="+iSecond);
		
	}
}
