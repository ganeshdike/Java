package Assignment7;

import java.util.Scanner;

public class CubeNumber
{
	private int iNum;
	public int getNumberCube(int num)
	{
		return(num*num*num);
	}
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		CubeNumber cubeNumber=new CubeNumber();
		
		System.out.println("Enter The Number ");
		cubeNumber.iNum=scanner.nextInt();
		
		int iResult=cubeNumber.getNumberCube(cubeNumber.iNum);
		System.out.println(cubeNumber.iNum+" cube is "+iResult);
		
		
	}

}
