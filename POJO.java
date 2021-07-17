/*Q6- Write a program to show POJO concept.
POJO: Plain Old Java Object

Should have:
1. POJO class must be public.
2. Must have a public default constructor.
3. May have the arguments constructor.
4. Must have some public Getters and Setters to access the object values.
5. Variables must be private for security.(The object in the POJO Class can have any access modifies such as private, public, protected.)

Should not have:
1. Not extend predefined classes.
2. Not implement prespecified interfaces.
3. Not have any prespecified annotation.
METHOD: Creating POJO class.
*/

//POJO Class
public class POJO 
{  
private String name;  // Declaring variables as private
private int rollno;  
private double marks;  

public POJO()   // Default constructor
{
    System.out.println("This is default constructor");
}

public POJO(String name, int rollno, double marks)      // Parameterized Constructor
{
    System.out.println("This is Parameterized constructor");
    this.name = name;
    this.rollno = rollno;
    this.marks = marks;
}

// Declaring Getters and Setters Method for each variable.
public String getName() 
{  
    return name;  
}  

public void setName(String name) 
{  
    this.name = name;  
}  

public int getRollno() 
{  
    return rollno;  
}  

public void setRollno(int rollno) 
{  
    this.rollno = rollno ;  
}  

public double getMarks() 
{  
    return marks;  
}  

public void setMarks(double marks) 
{  
    this.marks = marks;  
} 

}  