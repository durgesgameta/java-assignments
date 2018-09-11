package assignment.incremental1.durgesh.singleton;


public class SingleObject {
    String str;
    private static SingleObject singleObject;

    private SingleObject(String ip){
        str=ip;
    }

    public static SingleObject getInstance(String str){
        if(singleObject == null){               //Lazy Initialization
            singleObject = new SingleObject(str);
        }
        return singleObject;
    }

    public void getString(){
        System.out.println(str);
    }
}