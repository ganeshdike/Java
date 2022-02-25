package Assignment12;

public class MainClassInsurance
{

	public static void main(String[] args) 
	{
		TermPolicy policy=new TermPolicy();
		policy.setInsuranceDetails();
		policy.setLifeInsuranceDetails();
		policy.setTermPolicyDetails();
		
		System.out.println("**************Insurance Details***************");
		policy.getInsuranceInformation();
		policy.getLifeInsuranceInformation();
		policy.getTermPolicyInformetion();
		System.out.println("***********************************************");
	}

}
