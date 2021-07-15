/*Q9- Write a program showing interface and its usage.
Interface can have methods with no body (abstract method).
It is used to achieve abstraction and multiple inheritance in java.
METHOD: Achieving Multiple Inheritance and Exception Handling.
*/

import java.io.*;

interface exam  // Creating Interface
{
    public void percentage();   //abstract method
}

class student 
{
    String name;
    int roll_no;
    double marks1 , marks2;
    student(String name,int roll_no,double marks1,double marks2 )
    {
        this.name=name;
        this.roll_no=roll_no;
        this.marks1=marks1;
        this.marks2=marks2;
    }
}

class result extends student implements exam    //Extends student class and implements exam interface
{
    result(String n,int r,double m1,double m2)
    {
        super(n,r,m1,m2);    //Calling constructor of the parent class
    }
    public void percentage()    //Defining body of abstract method of the interface
    {
        double total = marks1 + marks2;
        double per = (total/200)*100;   // Marks out of 100
        System.out.println("Percentage is "+per);
    }
    void display()
    {
        System.out.println("Name of the student is "+name);
        System.out.println("Roll No of the student is "+roll_no);
    }
}

public class Interface {
    public static void main(String args[]) 
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        // Using Exceptions
        try
        {
            System.out.print("Enter name: ");   // Taking input from user
            String n=b.readLine(); 
            System.out.print("Enter roll no: ");
            int r=Integer.parseInt(b.readLine());   // Convert string to integer
            System.out.print("Enter marks1: ");
            double m1=Double.parseDouble(b.readLine());     //Convert string to double
            System.out.print("Enter marks2: ");
            double m2=Double.parseDouble(b.readLine());     //Convert string to double
            result re= new result(n,r,m1,m2);
            re.display();
            re.percentage();
        }
        catch(Exception e)
        {
            System.out.println("Exception is caught:: "+e);
        }
    }
}

/*OUTPUT:
Enter name: Fatema
Enter roll no: 75
Enter marks1: 80.5
Enter marks2: 90
Name of the student is Fatema
Roll No of the student is 75
Percentage is 85.25 */