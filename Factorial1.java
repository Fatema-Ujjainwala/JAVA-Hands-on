/*Q2- Write a program to find factorial of an integer.
Factorial: 5!= 1*2*3*4*5= 120
METHOD 1: Using for and while Loop*/

import java.util.*;

public class Factorial1 {
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: "); //Taking Input from user
        int n=s.nextInt();
        int fact=1;
        if(n<0) // Checking for negative values
        {
            System.out.println("Factorial of "+n+" is not possible");
        }
        else
        {
           for(int i=1; i<=n; i++) // Using for loop
            {
                fact=fact*i;    //Calculating factorial
            } 
            System.out.println("Using for loop: Factorial of "+n+" is " +fact);
            
            int f=1;
            int i =1;
            while(i<=n) // Using while loop
            {
                f=f*i;
                i++;
            }
            System.out.println("Using while loop: Factorial of "+n+" is " +f);
        }
    }
}

/*OUTPUT:
Enter a number : -2
Factorial of -2 is not possible

Enter a number : 5
Using for loop: Factorial of 5 is 120
Using while loop: Factorial of 5 is 120*/