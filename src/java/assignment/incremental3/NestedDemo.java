package assignment.incremental3;


// first outer class
class Outer1{

    //first inner class
    static class Inner1{
        // constructor for the Inner1 takes a argument
        Inner1 (String str){
            System.out.println(str);
        }
    }

}

//second outer class
class Outer2{

    //second inner class
    class Inner2 extends Outer1.Inner1 {
        // constructor of the inner class which in turn calls the superclass constructor
        Inner2(String str) {
            super(str);
        }
    }
}
