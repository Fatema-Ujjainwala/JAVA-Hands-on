/*Q6- Write a program to show POJO concept.
POJO: Plain Old Java Object
METHOD: Calling POJO class methods and variables.
*/

public class POJOcall {  
    public static void main(String[] args) 
    {   
        POJO p1 = new POJO();   // Initializing POJO object
        // Setting the values using the set() method
        p1.setName("Rohan");     
        p1.setRollno(30);
        p1.setMarks(90.5);
        // Getting the values using the get() method
        System.out.println("Name : "+ p1.getName());  
        System.out.println("Roll No : " + p1.getRollno());  
        System.out.println("Marks : " +p1.getMarks()); 
        
        
        POJO p2 = new POJO("Rekha",40,80);   // Initializing POJO object
        // Getting the values using the get() method
        System.out.println("Name : "+ p2.getName()); 
        System.out.println("Roll No : " + p2.getRollno());  
        System.out.println("Marks : " +p2.getMarks()); 
    }  
} 

/* OUTPUT:
This is default constructor
Name : Rohan
Roll No : 30
Marks : 90.5
This is Parameterized constructor
Name : Rekha
Roll No : 40
Marks : 80.0
*/ 