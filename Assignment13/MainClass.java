package Assignment13;

public class MainClass
{
	public static void main(String[] args) 
	{
		AccountImpl accountImpl=new AccountImpl();
		accountImpl.getSavingAccount();
		accountImpl.getUserDetails(accountImpl.name,accountImpl.balance);
	}
}
