package assignment.incremental1.durgesh.assignment;

public class singleton {
    String str;

    singleton(String ip){
        str=ip;
    }

    public static singleton init(String ip){
        return new singleton(ip);
    }

    public void get(){
        System.out.println(str);
    }
}

