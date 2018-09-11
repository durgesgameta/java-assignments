package assignment.incremental1.durgesh.data;

public class Data {
    int a;
    char ch;

    public Data(int c,char d){
        a=c;
        ch=d;
    }

    public void get(){
        System.out.println(a+" "+ch);
    }

    public void withoutInitialising(){
        //int c;// this statement will show compilation error as local uninitialised method variable do not get any value.
        //int d;// this statement will show compilation error as local uninitialised method variable do not get any value.
        //System.out.println(c+ " " + d);
    }
}
