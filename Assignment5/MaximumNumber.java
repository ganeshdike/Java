package Assignment5;

public class MaximumNumber 
{
	public void checkMaximumNumber(int iN1,int iN2,int iN3)
	{
		if((iN1>iN2)&&(iN1>iN3))
		{
			System.out.println("Maximum NUmber="+iN1);
		}
		else if((iN2>iN3)&&(iN2>iN1))		//10   20 30
		{
			System.out.println("Maximum NUmber="+iN2);
		}
		else
		{
			System.out.println("Maximum NUmber="+iN3);
		}
	}
	public static void main(String[] args)
	{
		int iNumber1=1,iNumber2=4,iNumber3=55;
		System.out.println(iNumber1+" "+iNumber2+" "+iNumber3);
		
		MaximumNumber maximumNumber=new MaximumNumber();
		maximumNumber.checkMaximumNumber(iNumber1,iNumber2,iNumber3);
		
	}

}
