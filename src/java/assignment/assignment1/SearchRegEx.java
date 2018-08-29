package assignment.assignment1;

import java.io.Console;
import java.io.*;
import java.nio.file.Files;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.*;




public class SearchRegEx {

    public static void searchRegEx(File directory,String pattern){
        //fList contain list of all the files in the directory
        File[] fList = directory.listFiles();

        Pattern p = Pattern.compile(pattern);

        for (File file : fList) {
            String path = file.getAbsolutePath();
            if(p.matcher(path).lookingAt())
                System.out.println("'" + pattern + "  matches "  + path + "'");
        }
    }

    public static void main(String[] args) {
        boolean flag=true;

        while(true){
            System.out.println("would you like to continue searching Y/N");
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();

            if(option.equals("N")) {
                break;
            }

            else{
                System.out.println("enter the pathname of the directory");
                String pathname = in.nextLine();
                File directory = new File(pathname);

                System.out.println("enter the reg Exp");
                String pattern = in.nextLine();


                try{

                    searchRegEx(directory,pattern);

                }
                catch (NullPointerException exp){
                    System.out.println("ENTER VALID DIRECTORY NAME");
                }

            }
        }
    }
}


