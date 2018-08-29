package assignment.assignment2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CheckAlphaPresense {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();

        String str = ip.toLowerCase();

        //flag array marks the presense and absense of the alphabate 'a' presense is recorded at index 0 ..... 'z' at 25
        int flag[]=new int[26];
        Arrays.fill(flag,-1);

        int m=str.length();

        for(int i=0;i<m;++i){
            char c= str.charAt(i);

            //
            flag[(int)c-(int)'a']=1;
        }

        int res=1;
        for(int i=0;i<26;++i){
            res*=flag[i];
        }
        if(res==-1)
            System.out.println("String does not contain all the alphabates");
        else
            System.out.println("String contain all the alphabates");

    }
}


// time & space complexity 0.12s 2184192KB