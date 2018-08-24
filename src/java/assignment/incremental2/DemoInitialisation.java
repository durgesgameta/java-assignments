package assignment.incremental2;

class Demo {
    String name;

    public Demo(String name) {
        this.name = name;
        System.out.println(name);
    }
}


// solution to question 3

/*
public class  DemoInitialisation{
    public static void main(String[] args) {
        Demo[] demo = new Demo[3]; //array of object references of class Demo

  }
}
*/



// solution to question 4

public class DemoInitialisation {
    public static void main(String[] args) {
        // initialising the object reference array
        Demo[] demo = new Demo[]{
                new Demo("object1"), new Demo("object2"), new Demo("object3")};
    }
}
