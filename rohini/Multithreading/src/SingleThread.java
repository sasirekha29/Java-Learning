import java.util.Scanner;

class Demo
{
	public void banking() throws Exception
	{
		System.out.println("Welcome!!");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Account no:");
		int acc_no=scan.nextInt();
		System.out.println("Enter the Password:");
		int pwd=scan.nextInt();
		Thread.sleep(5000);
		System.out.println("Collect the Money.Thank You!!");
		}
	public void numPrinting() throws Exception
	{
		System.out.println("Number Printing Started:");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(5000);
		}
		System.out.println("Number Printing is completed.");
	}
	public void charPrinting() throws Exception
	{
		System.out.println("Character Printing Started");
		for(int i=65;i<=70;i++)
		{
			System.out.println((char)i);
			Thread.sleep(5000);
		}
		System.out.println("Character Printing Completed");
	}
}
public class SingleThread 
{
    public static void main(String[] args) throws Exception {
	Demo d=new Demo();
	d.banking();
	d.numPrinting();
	d.charPrinting();

	}

}


