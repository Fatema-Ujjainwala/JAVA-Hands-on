/*Q1- Write a program to find if the input number is a prime number
METHOD 2: Using Math function and method */

import java.util.*;  
  
public class Prime2 
{  
    public static boolean checkPrime(int n) 
    {  
        int m = (int)Math.sqrt(n); //Using Math Function and Typeasting from double to int
        //System.out.println(m);
        if (n <= 1) 
        {  
            return false;  
        }  
        for (int i = 2; i < m; i++) 
        {  
            if (n % i == 0) 
            {  
                return false;  
            }  
        }  
        return true;  
    }
   public static void main(String[] args) 
   {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (checkPrime(n)) //Function call
       {  
           System.out.println(n + " is a prime number");  
       } 
       else 
       {  
           System.out.println(n + " is not a prime number");  
       }  
   } 
}

/*OUTPUT:
Enter a number : 1
1 is not a prime number

Enter a number : 11
11 is a prime number*/

