/*Q10- Write a program showing abstract class.
Abstract class have abstract methods(no method body) and have to be extended.
METHOD: Abstract class using abstract methods.
*/

abstract class calculate // Abstract Class
{
    int a,b;
    // Abstract Methods
    abstract void addition();
    abstract void subtraction();
    abstract void multiplication();
    abstract void division();
}

class arithmetic extends calculate
{
    arithmetic(int x, int y)
    {
        a=x;
        b=y;
    }
    //Implementation of Abstract Methods
    void addition()
    {
        System.out.println("Addition of "+a+" + "+b+" is "+(a+b));
    }
    void subtraction()
    {
        System.out.println("Subtraction of "+a+" - "+b+" is "+(a-b));
    }
    void multiplication()
    {
        System.out.println("Subtraction of "+a+" * "+b+" is "+(a*b));
    }
    void division()
    {
        System.out.println("Subtraction of "+a+" / "+b+" is "+(a/b));
    }
}

public class Abstract {
    public static void main(String args[]) 
    {
      arithmetic a = new arithmetic(30,20);     // Initializing Object.
      //Calling Methods
      a.addition();
      a.subtraction();
      a.multiplication();
      a.division();
    }
}


/*OUTPUT:
Addition of 30 + 20 is 50
Subtraction of 30 - 20 is 10
Subtraction of 30 * 20 is 600
Subtraction of 30 / 20 is 1
*/
