/*Q11- Write a program showing Threads and its starting mechanisms.
 METHOD 2: Using implements Runnable*/


class sample
{
	sample()
	{
		System.out.println("This is sample extended");
	}
}

class Task1 extends sample implements Runnable // Creating Thread using Runnable interface
{
	Task1()
	{
		super();
	}
	public void run()
	{
		for(int i=1; i <= 10; i++)	// Task of thread 
		{
			System.out.println("2 Printer, File : "+i);
		}
	}
}

public class Thread2
{
	public static void main(String[] args) 
	{
		System.out.println("-----Main Started-----");
		
		Task1 t = new Task1(); // Initializing object
		Thread th = new Thread(t);
		th.start(); // Calling start method to run thread
		
		for(int i=1; i <= 10; i++) // Task of main method
		{
			System.out.println("1 Printer, File : "+i);
		}
		
		System.out.println("-----Main Finished-----");
	}
}

/*OUTPUT:
-----Main Started-----
This is sample extended
1 Printer, File : 1
1 Printer, File : 2
2 Printer, File : 1
2 Printer, File : 2
2 Printer, File : 3
1 Printer, File : 3
2 Printer, File : 4
1 Printer, File : 4
2 Printer, File : 5
1 Printer, File : 5
1 Printer, File : 6
1 Printer, File : 7
1 Printer, File : 8
1 Printer, File : 9
1 Printer, File : 10
-----Main Finished-----
2 Printer, File : 6
2 Printer, File : 7
2 Printer, File : 8
2 Printer, File : 9
2 Printer, File : 10
*/
