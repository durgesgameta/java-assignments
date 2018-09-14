package assignment.incremental3;

// interface 1
interface Data {
    void name_Data();
    void address();
}

// interface 2
interface Student {
    void cls();
    void section();
}

// interface 3
interface Sport {
    void name_Sport();
    void pos();
}

// new interface extending all three interface
interface School extends Data, Student, Sport {
    void name_School();
}

// concrete class
class Dept {
    private int i = 0;
    public void D() {}
}


class Board extends Dept implements School {
    private int j = 0;


    public void name_Data() {

    }
    public void address() {

    }
    public void cls() {

    }
    public void name_School() {

    }
    public void name_Sport() {

    }
    public void pos() {

    }
    public void section() {

    }
}

public class Solution3 {
    public static void m1(Data data) { data.name_Data(); }
    public static void m2(Student student) { student.cls(); }
    public static void m3(Sport sport) { sport.name_Sport(); }
    public static void m4(School school) { school.name_School(); }

    public static void main(String[] args) {
        Board board = new Board();
        m1(board);
        m2(board);
        m3(board);
        m4(board);
    }
}
