package primethreaddemo;
import java.util.Scanner;
public class PrimeThread extends Thread   {
/*
 * A thread, in the context of Java, is the path followed when executing a program.
 * All Java programs have at least one thread
 * creating a thread is accomplished by implementing an interface and extending a class.
 * Every Java thread is created and controlled by the java.lang.Thread class
 * */
	//The Thread class itself implements Runnable, though its run method does nothing.
	//An application can subclass Thread, providing its own implementation of run
	public void run()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Thread Class - Please enter a Number :");
		
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
				Thread.sleep(100);
			}
			else
			{
				System.out.println ("prime number "+a);
				Thread.sleep(100);
			}
		}
		catch (Exception e){}
		sc.close();
	}

}
