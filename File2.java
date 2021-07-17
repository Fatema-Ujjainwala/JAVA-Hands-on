/*Q4- Write a program to find the input string whether present in a text file.
METHOD 1: Using indexOf() and contains() by writing to a file*/


import java.io.*;
import java.util.*;

public class File2
{
	public static void main(String[] args) throws Exception
	{
		try
		{	
			
			// Writing to a text file
			FileWriter fw = new FileWriter("C:\\Users\\FATEMA\\eclipse-workspace\\practise\\src\\practise\\NewFile.txt");
			Scanner s =new Scanner(System.in);
			System.out.println("Write a text to be written : "); // Taking input text from user
			String m = s.nextLine();
			fw.write(m);
			System.out.println("Text Written Successfully!!");
			fw.close(); 
			
			// Reading from a text file
			File fi = new File("C:\\Users\\FATEMA\\eclipse-workspace\\practise\\src\\practise\\NewFile.txt");
			System.out.println("\nReading from a file ");
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
					
					flag = 1;
				}
				
				if(st.contains(a)) // Using contains()
				{
					temp = 1;
				}
			}
			
			if(flag == 1)
			{
				System.out.println("indexOf() : String is present");
			}
			else
			{
				System.out.println("indexOf() : String is not present");
			}
			
			if(temp == 1)
			{
				System.out.println("contains() : String is present");
			}
			else
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
Write a text to be written : 
Hello Everyone. My name is Fatema.
Text Written Successfully!!

Reading from a file 
Hello Everyone. My name is Fatema.

Searching in a file 
Enter a string to search : 
name is
indexOf() : String is present
contains() : String is present

OUTPUT:
Write a text to be written : 
Hello Everyone. My name is Fatema.
Text Written Successfully!!

Reading from a file 
Hello Everyone. My name is Fatema.

Searching in a file 
Enter a string to search : 
hii
indexOf() : String is not present
contains() : String is not present
*/
