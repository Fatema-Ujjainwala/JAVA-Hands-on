/*Q5- Write a program to write the input strings into a text file.
METHOD: Using FileWriter  for writing to a file. Using  BufferedReader and Scanner for reading from the file.*/


import java.io.*;
import java.util.*;

public class File1 
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
			
			// Using BufferedReader
			System.out.println("\nReading from a file using BufferedReader ");
			BufferedReader br = new BufferedReader(new FileReader(fi));
			String st;
			while ((st = br.readLine()) != null)
			{
				System.out.println(st);
			}
			
			// Using Scanner
			System.out.println("\nReading from a file using Scanner ");
			Scanner sc = new Scanner(fi);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
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
This is Java Programming.
Text Written Successfully!!

Reading from a file using BufferedReader 
This is Java Programming.

Reading from a file using Scanner 
This is Java Programming.
*/
