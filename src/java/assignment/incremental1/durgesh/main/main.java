package assignment.incremental1.durgesh.main;

import assignment.incremental1.durgesh.data.Data;
import assignment.incremental1.durgesh.singleton.SingleObject;

public class main {
    public static void main(String[] args) {
        // object of first class
        Data dataObject=new Data(1,'d');
        dataObject.withoutInitialising();
        dataObject.get();

        //object of the  second class
        SingleObject singletonDemo = SingleObject.getInstance("new obj created");
        singletonDemo.getString();
    }
}
