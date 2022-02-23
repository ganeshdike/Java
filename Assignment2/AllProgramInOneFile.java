package Assignment2;

public class AllProgramInOneFile 
{
	private byte a=1;
	private short b=2;
	private int c=3;
	private long d=4;
	private float e=5.5F;
	private double f=10.00;
	private char i='g';
	private boolean h=true;
	private int y=25;	//Fifth Program
	
	
	public static void main(String[] args)
	{
		int x=50;	//Third Program
		
		AllProgramInOneFile object=new AllProgramInOneFile();//create Object
		
		System.out.println(object.i);//Second Program to print first character
		System.out.println(x);//print local vairable value,  Fourth program
		System.out.println(object.y);//six program 
		
	}

}
