import java.util.Scanner;

class InvaidInputException extends Exception
{
	public String getMessage()
	{
		return "Accountnumber/Password incorrect!! Try Again";
	}
}
class ATM
{
	private int acc_no=1234;
	private int pwd=4321;
	private int acc_no1;
	private int pwd1;
	
	public void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Accountnumber");
		acc_no1=scan.nextInt();
		System.out.println("Enter the Password");
		pwd1=scan.nextInt();
		}
	public void Verify() throws Exception
	{
		if(acc_no==acc_no1 && pwd==pwd1)
		{
			System.out.println("Collect your Money");
		}
		else
		{
			InvaidInputException ie=new InvaidInputException();
			System.out.println(ie.getMessage());
			throw ie;
		}
	}
}
class Bank
{
	public void initiate()
	{
		ATM atm=new ATM();
		try 
		{
			atm.acceptInput();
			atm.Verify();
		}
		catch(Exception e)
		{
			try
			{
				atm.acceptInput();
				atm.Verify();
			}
			catch(Exception f)
			{
				try
				{
					atm.acceptInput();
					atm.Verify();
				}
				catch (Exception g)
				{
					System.out.println("Card Blocked!!");
					System.exit(0);
				}
			}
		}
	}
}
public class ExceptionHandling {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.initiate();
	}

}


