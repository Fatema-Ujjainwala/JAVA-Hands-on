/*Q11- Write a program showing Threads and its starting mechanisms.
 METHOD 1: Using extends Thread*/


class Task extends Thread // Creating Thread extending Thread class
{
	public void run()
	{
		for(int i=1; i <= 10; i++)	// Task of thread 
		{
			System.out.println("2 Printer, File : "+i);
		}
	}
}

class Task2 extends Thread // Creating Thread extending Thread class
{
	public void run()
	{
		for(int i=1; i <= 10; i++)	// Task of thread 
		{
			System.out.println("3 Printer, File : "+i);
		}
	}
}

public class Thread1 
{
	public static void main(String[] args) 
	{
		System.out.println("-----Main Started-----");
		
		Task t = new Task(); // Initializing object
		t.start(); // Calling start method to run thread 1
		
		Task2 t2 = new Task2(); // Initializing object
		t2.start(); // Calling start method to run thread 2
		
		for(int i=1; i <= 10; i++) // Task of main method
		{
			System.out.println("1 Printer, File : "+i);
		}
		
		System.out.println("-----Main Finished-----");
	}
}

/*OUTPUT:
-----Main Started-----
2 Printer, File : 1
2 Printer, File : 2
2 Printer, File : 3
2 Printer, File : 4
2 Printer, File : 5
2 Printer, File : 6
1 Printer, File : 1
1 Printer, File : 2
1 Printer, File : 3
1 Printer, File : 4
1 Printer, File : 5
1 Printer, File : 6
1 Printer, File : 7
1 Printer, File : 8
1 Printer, File : 9
1 Printer, File : 10
-----Main Finished-----
2 Printer, File : 7
2 Printer, File : 8
2 Printer, File : 9
2 Printer, File : 10
3 Printer, File : 1
3 Printer, File : 2
3 Printer, File : 3
3 Printer, File : 4
3 Printer, File : 5
3 Printer, File : 6
3 Printer, File : 7
3 Printer, File : 8
3 Printer, File : 9
3 Printer, File : 10
*/
