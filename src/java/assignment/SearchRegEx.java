package assignment;

import java.io.Console;
import java.io.*;
import java.nio.file.Files;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.*;




public class SearchRegEx {


    public static void main(String[] args) {
        boolean flag=true;
        while(flag){
            System.out.println("would you like to continue searching Y/N");

            Scanner in = new Scanner(System.in);
            String option = in.nextLine();


            if(option.equals("N")) {
                flag=false;
                break;
            }
            else{
                System.out.println("enter the pathname of the directory");
                String pathname = in.nextLine();
                File directory = new File(pathname);

                System.out.println("enter the reg Exp");
                String pattern = in.nextLine();

                //fList contain list of all the files in the directory
                try{
                    File[] fList = directory.listFiles();

                    Pattern p = Pattern.compile(pattern);

                    for (File file : fList) {
                        String path = file.getAbsolutePath();
                        boolean found = p.matcher(path).lookingAt();
                        if(found==true)
                            System.out.println("'" + pattern + "  matches "  + path + "'");

                    }
                }
                catch (NullPointerException exp){
                    System.out.println("ENTER VALID DIRECTORY NAME");
                }

            }
        }
    }
}


