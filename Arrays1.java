/*Q12- Write a program to check if two integer arrays have same elements in them.
METHOD 1: Using condition and equals().
*/

import java.util.*;

public class Arrays1 {
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        
        // Taking inputs from user for array 1
        System.out.print("Enter size of array1: ");
        int size1=s.nextInt();
        int arr1[] = new int[size1];
        for(int i=0; i < size1; i++)
        {
            arr1[i]=s.nextInt();
        }
        
        // Taking inputs from user for array 2
        System.out.print("Enter size of array2: ");
        int size2=s.nextInt();
        int arr2[] = new int[size2];
        for(int i=0; i < size2; i++)
        {
            arr2[i]=s.nextInt();
        }
        
        // Sorting arrays for comparison
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Displaying elements of array 1
        System.out.println("Elements of array1:");
        for(int j=0; j < arr1.length; j++)
        {
            System.out.print(arr1[j]+" ");
        }
        
        // Displaying elements of array 2
        System.out.println("\nElements of array2:");
        for(int j=0; j < arr2.length; j++)
        {
            
            System.out.print(arr2[j]+" ");
        }
        
        
        // Comparing elements of array using Equals()
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("\nArrays are equal");
        }
        else
        {
            System.out.println("\nArrays are not equal");   
        }
        
    }
}

/*OUTPUT:
Enter size of array1: 5
1
5
4
2
3
Enter size of array2: 5
5
6
1
3
8
Elements of array1:
1 2 3 4 5 
Elements of array2:
1 3 5 6 8 
Arrays are not equal.


Enter size of array1: 5
6
5
8
7
4
Enter size of array2: 5
4
8
6
5
7
Elements of array1:
4 5 6 7 8 
Elements of array2:
4 5 6 7 8 
Arrays are equal.
*/