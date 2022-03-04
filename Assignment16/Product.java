package Assignment16;

public class Product 
{
	public int weight=20;
	
	public int getWeight() 
	{
		return weight;
	}
	public void productCheck(int weignt)
	{
		if(weight<100)
		{
			throw new ProductException("Weight shuld be greter than 100");
		}
		else
		{
			System.out.println("Is All Right...");
		}
	}
}
