package Assignment12;

public class MainClassBank
{

	public static void main(String[] args)
	{
	
		System.out.println("*************Enter ICICI Bank Details****************");
		ICICIBank bank=new ICICIBank();
		bank.getICICIBankDetails();
		System.out.println("ICICI Bank Interest is :"+bank.getCalculateInterest(bank.principleAmount, bank.tenure, bank.rateOfInterest));
		
		System.out.println("*************Enter SBI Bank Details****************");
		SBIBank sbiBank=new SBIBank();
		sbiBank.getSBIBankDetails();
		System.out.println("SBI Bank Interest is :"+sbiBank.getCalculateInterest(sbiBank.principleAmount, sbiBank.tenure, sbiBank.rateOfInterest));
		
		System.out.println("*************Enter HDFC Bank Details****************");
		HDFCBank hdfcBank=new HDFCBank();
		hdfcBank.getHDFCBankDetails();
		System.out.println("HDFC Bank Interest is :"+hdfcBank.getCalculateInterest(hdfcBank.principleAmount, hdfcBank.tenure, hdfcBank.rateOfInterest));
		
	}

}
