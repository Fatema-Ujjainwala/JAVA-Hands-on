/*Q8- to show method over-riding and over-loading.
METHOD 2: Overriding- Same method name and parameter in different class.Used in inheritance (Run time Polymosrphism) */

class area
{   
    int length, width;
    area(int l,int w)
    {
        length=l;
        width= w;
    }
    void display()
    {
        System.out.println("Inside area class ");
        System.out.println("Area of rectangle= " + length * width);
    }
}

class perimeter extends area
{
    perimeter(int l,int w)
    {
        super(l,w);
    }
    void display()      // Overriding display method
    {
        super.display();    //Calling display method of the parent class using super keyword
        System.out.println("Inside perimeter class ");
        int p=2*(length+width);
        System.out.println("Perimeter of rectangle= " +p);
    }
}

public class Overriding     
{
    public static void main(String args[])
    {
        perimeter r = new perimeter(4,5);   // Initializing object of the child class
        r.display();    // Calling function of the child class
    }
}

/*OUTPUT:
Inside area class 
Area of rectangle= 20
Inside perimeter class 
Perimeter of rectangle= 18
*/