package assignment.incremental5;

import java.util.Scanner;

public class RegEx {

    public static boolean checkRegEx(String regEx, String ip) {
        return ip.matches(regEx);
    }

    public static void main(String[] args) {
        // starts with any capital A through Z
        // then zero or more of any char except endline
        // ends with .
        String regEx = "^[A-Z].*[\\.]$";
        System.out.println("Enter the input: ");
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();

        if(checkRegEx(regEx,ip))
            System.out.println("input satisfies the regular expression");
        else
            System.out.println("input do not satisfies the regular expression");
    }
}