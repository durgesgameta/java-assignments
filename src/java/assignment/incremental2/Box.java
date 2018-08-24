package assignment.incremental2;

class Box
{
    double width, height, depth;

    //constructor without parameter
    Box()
    {
        height = depth = 0;
    }

    //constructor with parameter
    Box(double len)
    {
        this();   // call to the constructor without parameter
        width = len;

    }

    //function to print the values of the instance variable
    void display(){
        System.out.println(width+ " "+ height+ " "+ depth);
    }

    public static void main(String[] args) {
        Box b=new Box(5);
        b.display();
    }
}

