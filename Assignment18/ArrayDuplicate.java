package Assignment18;

import java.util.Scanner;

public class ArrayDuplicate 
{	
	public static void main(String[] args) 
	{
		int arr[];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter limit of Array : ");
		int limit=scanner.nextInt();
		arr=new int[limit];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter "+(i+1)+" element : ");
			arr[i]=scanner.nextInt();
		}
		System.out.print("\nArray element is :");
		for(int data:arr)
		{
			System.out.print(" "+data);
		}
		
		int count=1;
		int flag=0;
		System.out.print("\nMissing Element is : ");
		for(int i=0;i<arr.length-1;i++)
		{
			if(count<arr.length)
			{	
				flag=0;
			
				for(int j=0;j<arr.length;j++)
				{
					if((arr[j]==count))
					{
						flag=1;
						count++;
						break;
					}
				}
			}
			if(flag==0)
			{
				System.out.print(" "+count);
				count++;
			}
		}
		count=0;
		System.out.print("\nDuplicate Element is :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(" "+arr[i]);
					count++;
					break;
				}
			}
				
		}
		if(count==0)
		{
			System.out.print("Duplicate element is not present in this Array");
		}
	}

}
