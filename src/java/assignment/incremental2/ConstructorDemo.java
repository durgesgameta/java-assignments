package assignment.incremental2;

public class ConstructorDemo
{
    double width, height, depth;

    //constructor without parameter
    ConstructorDemo()
    {
        height = depth = 0;
    }

    //constructor with parameter
    ConstructorDemo(double len)
    {
        this();   // call to the constructor without parameter
        width = len;

    }

    //function to print the values of the instance variable
    void getDimension(){
        System.out.println(width+ " "+ height+ " "+ depth);
    }

    public static void main(String[] args) {
        ConstructorDemo b=new ConstructorDemo(5);
        b.getDimension();
    }
}

