package assignment.incremental3;


interface Cycle{
    void getType();
}

interface Factory{
    Cycle getObject();
}

class Unicycle implements Cycle{
    public void getType(){
        System.out.println("Unicycle");
    }
}

class Bicycle implements Cycle{
    public void getType(){
        System.out.println("Riding Bi");
    }
}

class Tricycle implements Cycle{
    public void getType(){
        System.out.println("Riding Tri");
    }
}


class UniFactory implements Factory{
    public Cycle getObject(){
        return new Unicycle();
    }
}


class BiFactory implements Factory{
    public Cycle getObject(){
        return new Bicycle();
    }
}

class TriFactory implements Factory{
    public Cycle getObject(){
        return new Tricycle();
    }
}

public class Solution4 {
    public static void factoryDemo(Factory factory){
        Cycle c = factory.getObject();
        c.getType();
    }
    public static void main(String[] args) {
        factoryDemo(new UniFactory());
        factoryDemo(new BiFactory());
        factoryDemo(new TriFactory());
    }
}