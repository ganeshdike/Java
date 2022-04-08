package Assignment26;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class CRUDoperations 
{
	public static void main(String[] args) 
	{
		int choice=0;
		Scanner scanner=new Scanner(System.in);
		do
		{
			System.out.println("\n----------------------------------------------------------------");
			System.out.println("1.Insert Record");
			System.out.println("2.Read Record");
			System.out.println("3.Delete Record using ID only");
			System.out.println("4.Update Record Using ID only");
			System.out.println("5.exit");
			System.out.println("\n----------------------------------------------------------------");
			
			System.out.println("Enter Your Choice Integer Format ");
			choice=scanner.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter First Name : ");
				scanner.nextLine();
				String firstName=scanner.nextLine();
				
				System.out.println("Enter Last Name : ");
				String lastName=scanner.nextLine();
				
				System.out.println("Enter City : ");
				String city=scanner.nextLine();
				
				System.out.println("Enter Mobile Number : ");
				long mobileNo=scanner.nextLong();
				
				UserEntityClass user=new UserEntityClass(firstName,lastName,city,mobileNo);
				InsertRecordUser insertRecordUser=new InsertRecordUser();
				insertRecordUser.insertRecord(user);
				System.out.print("\n----------------------------------------------------------------");
				
			}
			else if(choice==2)
			{
				System.out.println("User Table Data is....\n");
				ReadDataFromUser user=new ReadDataFromUser();
				user.getDataFromUser();
				System.out.print("\n----------------------------------------------------------------");
			}
			else if(choice==3)
			{
				System.out.println("Enter id,Which row you wan't be deleted ");
				int id=scanner.nextInt();
				
				DeleteUserRecord delete=new DeleteUserRecord();
				delete.deleteRecord(id);
				System.out.print("\n----------------------------------------------------------------");
			}
			else if(choice==4)
			{
				System.out.println("Enter Id , which you Wan't to update mobile Number : ");
				int id=scanner.nextInt();
				
				System.out.println("Enter Mobile Number to update : ");
				long mobileNo=scanner.nextLong();
				
				UserEntityClass user=new UserEntityClass();
				user.setMobileNo(mobileNo);
		
				UpadateRecordUser update=new UpadateRecordUser();
				update.updateRecord(id, user);
				System.out.print("\n----------------------------------------------------------------");
				
				
			}
			else if(choice==5)
			{
				System.out.println("Thanku.....");
			}
			else
			{
				System.out.println("Kya kar raha hain bhai tu,Please Enter Valied Choice....");
			}
				
		
		}while(choice!=5);
	}

}
