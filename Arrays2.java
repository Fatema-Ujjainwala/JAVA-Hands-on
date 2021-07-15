/*Q12- Write a program to check if two integer arrays have same elements in them.
METHOD 2: Using ArrayList and Loop.Different ways of accessing ArrayList
*/

import java.util.*;

public class Arrays2 {
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        
        // Taking inputs from user for array 1
        System.out.print("Enter size of array1: ");
        int size1=s.nextInt();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0; i < size1; i++)
        {
            arr1.add(s.nextInt());
        }
        
        // Taking inputs from user for array 2
        System.out.print("Enter size of array2: ");
        int size2=s.nextInt();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        for(int i=0; i < size2; i++)
        {
            arr2.add(s.nextInt());
        }
        
        // Sorting arrays for comparison
        Collections.sort(arr1);
        Collections.sort(arr2);
        
        // Displaying elements of array
        System.out.println("\n--------------------------------------------");
        System.out.println("Elements of array1: "+arr1);
        System.out.print("Elements of array2: "+arr2);
        
        // Displaying elements of array using for each loop
        System.out.println("\n--------------------------------------------");
        System.out.println("Displaying elements using for each loop");
        System.out.println("Elements of array1: ");
        for(int e: arr1)
        {
            System.out.print(e+" ");
        }
        System.out.println("\nElements of array2: ");
        for(int e: arr2)
        {
            System.out.print(e+" ");
        }
        
        // Displaying elements of array using for iterator
        System.out.println("\n--------------------------------------------");
        System.out.println("Displaying elements using iterator");
        Iterator<Integer> iter1= arr1.iterator();
        Iterator<Integer> iter2= arr2.iterator();
        System.out.println("Elements of array1: ");
        while (iter1.hasNext()) 
        {
            System.out.print(iter1.next() + " ");
        }
        System.out.println("\nElements of array2: ");
        while (iter2.hasNext()) 
        {
            System.out.print(iter2.next() + " ");
        }
        
        // Comapring elements of array
        System.out.println("\n--------------------------------------------");
        int flag=0;
        if(arr1.size() == arr2.size())  //Checking length of both the arrays
        {
            for(int i=0; i < arr1.size(); i++)
            {
                if(arr1.get(i) != arr2.get(i))
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println("Arrays are equal.");
            }
            else
            {
                System.out.println("Arrays are not equal.");
            }
        }
        else
        {
            System.out.println("Arrays are not equal.");
        }
        
    }
}
        

/*OUTPUT:
Enter size of array1: 5
1
5
6
4
3
Enter size of array2: 6
6
1
3
5
9
1

--------------------------------------------
Elements of array1: [1, 3, 4, 5, 6]
Elements of array2: [1, 1, 3, 5, 6, 9]
--------------------------------------------
Displaying elements using for each loop
Elements of array1: 
1 3 4 5 6 
Elements of array2: 
1 1 3 5 6 9 
--------------------------------------------
Displaying elements using iterator
Elements of array1: 
1 3 4 5 6 
Elements of array2: 
1 1 3 5 6 9 
--------------------------------------------
Arrays are not equal.


Enter size of array1: 5
1
5
3
4
2
Enter size of array2: 5
3
5
1
2
4

--------------------------------------------
Elements of array1: [1, 2, 3, 4, 5]
Elements of array2: [1, 2, 3, 4, 5]
--------------------------------------------
Displaying elements using for each loop
Elements of array1: 
1 2 3 4 5 
Elements of array2: 
1 2 3 4 5 
--------------------------------------------
Displaying elements using iterator
Elements of array1: 
1 2 3 4 5 
Elements of array2: 
1 2 3 4 5 
--------------------------------------------
Arrays are equal.
*/