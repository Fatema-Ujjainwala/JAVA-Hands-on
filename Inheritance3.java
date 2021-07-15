/*Q7- Write a program  to show inheritance concept.
METHOD 3: Using Hierarchical Inheritance*/


class rectangle       // Parent Class
{
    int length=5, width=6, height=7;
}


class area extends rectangle    // Child 1 class Inheriting using extends
{
    int calculate_area()
    {
        return (super.length * super.width);
    }
}

class perimeter extends rectangle   // Child 2 class Inheriting using extends
{   
    int calculate_perimeter()
    {
        return(2*(super.length + super.width));
    }
}

class volume extends rectangle   // Child 3 class Inheriting using extends
{
    int calculate_volume()
    {
        return(super.length * super.width * super.height);
    }
}



public class Inheritance3 {
    public static void main(String args[])
    {
        area a = new area();        // Initializing object of area class
        perimeter p = new perimeter();  // Initializing object perimeter class
        volume v = new volume();   // Initializing object of volume class
        System.out.println("Area of Rectangle= "+a.calculate_area());   // Calling Function of area class
        System.out.println("Perimeter of Rectangle= "+p.calculate_perimeter());   // Calling Function of perimeter class
        System.out.println("Volume of Rectangle= "+v.calculate_volume());   // Calling function of volume class
        
    }
    
}

/*OUTPUT:
Area of Rectangle= 30
Perimeter of Rectangle= 22
Volume of Rectangle= 210
*/