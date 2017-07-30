package primethreaddemo;
import java.util.Scanner;
//The Runnable interface defines a single method, run, meant to contain the code executed in the thread.
public class PrimeRun implements Runnable {
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Runnable interface - Please enter a Number :");
		
		int a = sc.nextInt();
		int cnt = 0;
		try
		{
			for(int i=2;2*i<a;i++)
			{
				if(a%i==0)
				{
					cnt++;
					
				}
				
				
			}
			if(cnt > 0)
			{
				System.out.println ("not a prime number "+a);
			}
			else
			{
				System.out.println ("prime number "+a);
			}
		}
		catch (Exception e){}
		sc.close();
	}
}
