package assignment.incremental3;



 class Cycle1 {
    void balance(){
        System.out.println("in cycle");
    }
}

 class Unicycle1 extends Cycle1 {
    void balance(){
        System.out.println("in unicycle");
    }
}

 class Bicycle1 extends Cycle1 {
    void balance(){
        System.out.println("in bicycle");
    }
}

 class Tricycle1 extends Cycle1 {
}


public class Solution2 {

    public static void main(String[] args) {

        Cycle1 arr[]=new Cycle1[3];
        arr[0]=new Unicycle1();
        arr[1]=new Bicycle1();
        arr[2]=new Tricycle1();

        arr[0].balance();   //upcasted object but calls the balance method of the Unicycle class
        arr[1].balance();   //upcasted object but calls the balance method of the Bicycle class
        arr[2].balance();   //upcasted object but calls the balance method of the Cycle class as there is no balance defined fot Tricycle


        ((Unicycle1) arr[0]).balance();  //downcasted object calls the balance method of the Unicycle class
        ((Bicycle1) arr[1]).balance();   //downcasted object calls the balance method of the Bicycle class
        ((Tricycle1) arr[2]).balance();  //downcasted object calls the balance method of the Cycle class

    }

}
