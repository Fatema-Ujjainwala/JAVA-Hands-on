/*Q7- Write a program  to show inheritance concept.
METHOD 2: Using Multilevel Inheritance*/


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

class perimeter extends area // Level 1 Child class Inheriting using extends
{   
    perimeter(int l,int w)
    {
        super(l,w);
    }
    int calculate_perimeter()
    {
        return(2*(length+width));
    }
}

class volume extends perimeter // Level 2 Child class Inheriting using extends
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



public class Inheritance2 {
    public static void main(String args[])
    {
        volume v = new volume(2,3,4);   // Initializing object and passing values.
        System.out.println("Area of Rectangle= "+v.calculate_area());   // Calling Function of Parent class
        System.out.println("Perimeter of Rectangle= "+v.calculate_perimeter());   // Calling Function of Level 1 Child  class
        System.out.println("Volume of Rectangle= "+v.calculate_volume());   // Calling function of Level 2 Child class
        
    }
    
}

/*OUTPUT:
Area of Rectangle= 6
Perimeter of Rectangle= 10
Volume of Rectangle= 24
*/