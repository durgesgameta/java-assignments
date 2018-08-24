package assignment.incremental4;

class AgeException extends Exception{
    AgeException(String str){
        super(str);
    }
}


class NameException extends Exception{
    NameException(String str){
        super(str);
    }
}

class GenderException extends Exception{
    GenderException(String str){
        super(str);
    }
}

public class ErrorHandling {

    public static void throwDemo(int age,String Name, char c) throws AgeException, NameException, GenderException {
        if(age<0) throw new  AgeException("age exception");
        if(Name.length()==0) throw new NameException("name exception");
        if(c!='M' || c!='F')  throw new GenderException("Gender exception");
    }

    public static void ErrorHandling(String[] args) {
        try{
            throwDemo(-1,"lucy",'F');
            throwDemo(5,"",'F');
            throwDemo(5,"Mac",'T');
        }
        catch (NameException | GenderException | AgeException exp){
            System.out.println(exp.getMessage());
        }

        finally {
            System.out.println("the  finally block executed");
        }
    }
}