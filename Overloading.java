/*Q8- to show method over-riding and over-loading.
METHOD 1: Overloading- Same method name but different datatype/parameters (Compile Time Polymorphism)*/


public class Overloading     
{
    void area(int l)
    {
        System.out.println("Area of square= " +l*l);
    }
    void area(double l)
    {
        System.out.println("Area of square= " +l*l);
    }
    void area(int l, int w)
    {
        System.out.println("Area of rectangle= " +l*w);
    }
    void area(double l, double w)
    {
        System.out.println("Area of rectangle= " +l*w);
    }

    public static void main(String args[])
    {
        Overloading o = new Overloading(); // Initializing object
        // Calling Methods 
        o.area(5); 
        o.area(5.5);
        o.area(4,4);
        o.area(4.5,4.5);
    }
}


/*OUTPUT:
Area of square= 25
Area of square= 30.25
Area of rectangle= 16
Area of rectangle= 20.25
*/