package assignment.incremental7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {

    public static Map<Character,Integer> countLetters(String filename) throws IOException{

        Map< Character,Integer> resultMap =
                new HashMap< Character, Integer>();


        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line;
        while((line = in.readLine()) != null){
            line = line.toUpperCase();
             for(char s1:line.toCharArray()){
                if(!resultMap.containsKey(s1)) {
                    resultMap.put(s1,1);
                }
                else {
                    resultMap.put(s1, resultMap.get(s1)+1);
                }
            }
        }
        in.close();
        return resultMap;
    }

    public static void main(String[] args) throws IOException{

        System.out.println("Enter the file location");
        Scanner in = new Scanner(System.in);
        String fileLoc = in.nextLine();

        Map< Character,Integer> resultMap=countLetters(fileLoc);
        for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}

