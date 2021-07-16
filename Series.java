/*Q3- WAP to find if the input string is in fibonacci or palindrome series.
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 55 89....
Palindrome: 121 is a palindrome
METHOD: Using conditions and loop. 
*/

import java.util.*;

public class Series 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();    // Taking input from user
        
        // Logic for Fibonacci 
        System.out.println("---------------Fibonacci Series----------------");
        int n1=0, n2=1, n3=0;
        while(n3 < n)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        if(n3 == n) // To check if the number is present in fibonacci series or not
        {
            System.out.println(n+" is in Fibonacci Series.");
        }
        else
        {
            System.out.println(n+" is not in Fibonacci Series.");
        }
        
        // Logic for Palindrome
        System.out.println("\n---------------Palindrome Series---------------");
        int r, temp=n, sum=0;
        while(temp > 0)
        {
            r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if(n == sum) // To check if the number is present in palindrome series or not
        {
            System.out.println(n+" is in Palindrome Series.");
        }
        else
        {
            System.out.println(n+" is not in Palindrome Series.");
        }
    }
}

/*OUTPUT :
Enter a number : 55
---------------Fibonacci Series----------------
55 is in Fibonacci Series.

---------------Palindrome Series---------------
55 is in Palindrome Series.


Enter a number : 121
---------------Fibonacci Series----------------
121 is not in Fibonacci Series.

---------------Palindrome Series---------------
121 is in Palindrome Series.
*/