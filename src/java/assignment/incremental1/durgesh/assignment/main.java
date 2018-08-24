package assignment.incremental1.durgesh.assignment;

public class main {
    public static void main(String[] args) {
        // object of first class
        data obj_data=new data(1,'d');
        obj_data.wo_ini();
        obj_data.get();

        singleton obj_singleton= singleton.init("new obj created");
        obj_singleton.get();
    }
}
