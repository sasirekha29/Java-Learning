import java.util.Scanner;

/*class Task1 extends Thread
{
	public void run()
	{
		try {
		System.out.println("Welcome!!");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Account no:");
		int acc_no=scan.nextInt();
		System.out.println("Enter the Password:");
		int pwd=scan.nextInt();
		Thread.sleep(5000);
		System.out.println("Collect the Money.Thank You!!");
		}
		catch (Exception e) {
			System.out.println("Error!!");
		}
		}
}*/
class Task2 extends Thread
{
	public void run()
	
	{
		try {
		System.out.println("Enter the Number:");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(5000);
		}
		System.out.println("Number Printing is completed.");
	}
		catch(Exception e)
		{
			System.out.println("Error!!");
		}
		}
	}
class Task3 extends Thread{
	public void run()
	{
		try {
		System.out.println("Character Printing Started");
		for(int i=65;i<=70;i++)
		{
			System.out.println((char)i);
			Thread.sleep(5000);
		}
		System.out.println("Character Printing Completed");
	}
	catch(Exception e)
	{
		System.out.println("Error!!");
	}
}
	}
public class MultiThread 
{
    public static void main(String[] args) {
    	
//	Task1 t1=new Task1();
	Task2 t2=new Task2();
	Task3 t3=new Task3();
	//t1.start();
	t2.start();
	t3.start();
	
	}
}

