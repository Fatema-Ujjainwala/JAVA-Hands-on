/*Q4- Write a program to find the input string whether present in a text file.
METHOD 2: Using indexOf() and contains() by printing lines which contains words.*/


import java.io.*;
import java.util.*;

public class File3
{
	public static void main(String[] args) throws Exception
	{
		try
		{	
			Scanner s =new Scanner(System.in);
			
			// Reading from a text file
			File fi = new File("C:\\Users\\FATEMA\\eclipse-workspace\\practise\\src\\practise\\NewFile.txt");
			System.out.println("Reading from a file ");
			Scanner sc = new Scanner(fi);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}	
			
			// Searching in a text file
			System.out.println("\nSearching in a file ");
			BufferedReader br = new BufferedReader(new FileReader(fi));
			String st;
			
			System.out.println("Enter a string to search : ");
			String a = s.nextLine();
			int flag=0,temp=0;
			while ((st = br.readLine()) != null)
			{
				if((st.indexOf(a)) >= 0) // Using indexOf()
				{
					System.out.println("indexOf() : "+st);
					flag = 1;
				}
				
				if(st.contains(a)) // Using contains()
				{	
					System.out.println("contains() : "+st);
					temp = 1;
				}
			}
			
			if(flag == 0)
			{
				System.out.println("indexOf() : String is not present");
			}
			
			if(temp == 0)
			{
				System.out.println("contains() : String is not present");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught :: "+e);
		}
	}
}

/*
OUTPUT:
Reading from a file 
Hello Everyone
Java is the popular programming language.
It is used in most of the applications.

Searching in a file 
Enter a string to search : 
is
indexOf() : Java is the popular programming language.
contains() : Java is the popular programming language.
indexOf() : It is used in most of the applications.
contains() : It is used in most of the applications.


OUTPUT:
Reading from a file 
Hello Everyone
Java is the popular programming language.
It is used in most of the applications.

Searching in a file 
Enter a string to search : 
hey
indexOf() : String is not present
contains() : String is not present
*/

