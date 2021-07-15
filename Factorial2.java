/*Q2- Write a program to find factorial of an integer.
Factorial: 5!= 1*2*3*4*5= 120
METHOD 2: Using Recursion Function*/

import java.util.*;

public class Factorial2 {
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return(n*factorial(n-1));   //Recursion: function call to itself 
        }
    }
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: "); //Taking Input from user
        int n=s.nextInt();
        //int fact;
        if(n<0) // Checking for negative values
        {
            System.out.println("Factorial of "+n+" is not possible");
        }
        else
        {
            //fact=factorial(n);
            System.out.println("Factorial of "+n+" is " +factorial(n)); //Calling Function
        }
    }
}

/*OUTPUT:
Enter a number : -6
Factorial of -6 is not possible

Enter a number : 4
Factorial of 4 is 24*/