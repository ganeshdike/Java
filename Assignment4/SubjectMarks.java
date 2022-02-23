package Assignment4;

public class SubjectMarks 
{
	public static int iFirstSubjct;
	public static int iSecondSubject;
	public static int iThirdSubject;
	public static int iFourthSubject;
	public static int iFifthSubject;
	
	public static void main(String[] args) 
	{
		SubjectMarks.iFirstSubjct=70;
		SubjectMarks.iSecondSubject=65;
		SubjectMarks.iThirdSubject=53;
		SubjectMarks.iFourthSubject=85;
		SubjectMarks.iFifthSubject=91;
		
		int iResult=SubjectMarks.average(iFirstSubjct,iSecondSubject,iThirdSubject,iFourthSubject,iFifthSubject);
		System.out.println("Average="+iResult+"%");
	}
	
	public static int average(int s1,int s2,int s3,int s4,int s5)
	{
		int totalSum=s1+s2+s3+s4+s5;
		int avg=(totalSum/5);
		return avg;
	}
}
