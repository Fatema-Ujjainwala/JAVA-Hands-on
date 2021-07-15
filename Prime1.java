/*Q1- Write a program to find if the input number is a prime number
METHOD 1: Using loops and number/2 */

import java.util.*;

public class Prime1
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);  
        System.out.print("Enter a number : ");  
        int n = s.nextInt();
        int flag=0;
        if(n < 2) //To check for negative numbers 
        {
            flag=1;
        }
        else
        {
            for (int i = 2; i < n/2; i++) //For loop using number/2
            {
                if(n % i == 0)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag == 1)
            System.out.println(n + " is not a prime number");
        else
            System.out.println(n + " is a prime number");
        
    }
}

/*OUTPUT:
Enter a number : -6
-6 is not a prime number

Enter a number : 97
97 is a prime number*/
