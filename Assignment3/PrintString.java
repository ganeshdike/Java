package Assignment3;

public class PrintString
{
	String name;
	public static void main(String[] args) 
	{
		PrintString printString=new PrintString();
		String returnValue=printString.getStudentName("Ganesh");
		System.out.println(returnValue);
	}
	
	public String getStudentName(String name)
	{
		String studentName=name;
		return studentName;		
	}

}
