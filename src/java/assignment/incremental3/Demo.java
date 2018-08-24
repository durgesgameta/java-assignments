package assignment.incremental3;

// object of this class cannot be created but the reference can be
abstract class Rodent
{
    // this is called whenever the object of the derived class is created
    Rodent(){
        System.out.println("Rodent object is created");
    }

    abstract void eat();   // abstract function
    abstract void run();    // abstract function
}

class Mouse extends Rodent
{
    Mouse(){
        System.out.println("Mouse object is created");
    }

    void eat()
    {
        System.out.println("Mouse is eating");
    }
    void run()
    {
        System.out.println("Mouse is running");
    }
}
class Gerbil extends Rodent
{
    Gerbil(){
        System.out.println("Gerbil object is created");
    }
    void eat()
    {
        System.out.println("Gerbil is eating");
    }
    void run()
    {
        System.out.println("Gerbil is running");
    }
}
class Hamster extends Rodent
{
    Hamster(){
        System.out.println("Hamster object is created");
    }
    void eat()
    {
        System.out.println("Hamster is eating");
    }
    void run()
    {
        System.out.println("Hamster is running");
    }
}
class Demo
{
    public static void main(String args[])
    {
        Rodent r[] = new Rodent[3];
        r[0] = new Mouse();
        r[1] = new Gerbil();
        r[2] = new Hamster();

        r[0].eat();
        r[0].run();

        r[1].eat();
        r[1].run();

        r[2].eat();
        r[2].run();
    }
}
