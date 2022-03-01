package Assignment15;

import java.util.Scanner;

public class Policy 
{
	int policyId;
	String policyName;
	String policyType;
	long premiumAmount;
	
	public Policy getPolicyDetails()
	{
		Policy policy=new Policy();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Policy Id : ");
		policy.policyId=scanner.nextInt();
		System.out.println("Enter Policy Name : ");
		scanner.nextLine();
		policy.policyName=scanner.nextLine();
		System.out.println("Enter Policy Type : ");
		policy.policyType=scanner.nextLine();
		System.out.println("Enter Policy premium Amount : ");
		policy.premiumAmount=scanner.nextLong();
		
		return policy;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", premiumAmount=" + premiumAmount + "]";
	}
	
}
