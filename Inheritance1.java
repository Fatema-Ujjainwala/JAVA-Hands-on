/*Q7- Write a program  to show inheritance concept.
METHOD 1: Using Single Level Inheritance*/


class area      // Parent Class
{
    int length,width;
    area(int l, int w)
    {
        length=l;
        width=w;
    }
    int calculate_area()
    {
        return (length*width);
    }
}

class volume extends area // Child class Inheriting using extends
{
    int height;
    volume(int l,int w,int h)
    {
        super(l,w);
        height=h;
    }
    int calculate_volume()
    {
        return(length*width*height);
    }
}

public class Inheritance1 {
    public static void main(String args[])
    {
        volume v = new volume(2,3,4);   // Initializing object and passing values.
        System.out.println("Area of Rectangle= "+v.calculate_area());   // Calling Function of Parent class
        System.out.println("Volume of Rectangle= "+v.calculate_volume());   // Calling function of Child class
        
    }
    
}

/*OUTPUT:
Area of Rectangle= 6
Volume of Rectangle= 24
*/