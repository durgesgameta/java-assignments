package assignment.assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class PingStatistics {
    public static void runSystemCommand(String command) {
        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            // string to hold the ping command output
            String pingStatictics = "";

            // packetCount limit the number of  packet sent 10 in this case
            int packetCount=0;

            // array to hold the time taken by each packet
            float[] time=new float[10];

            // reading output stream of the command
            while ((pingStatictics = inputStream.readLine()) != null && packetCount<10 ) {

                //from the output get the time tacken by each packet
                int start=pingStatictics.lastIndexOf("=");

                // pingStatictics hold the time taken by the packet as String object
                pingStatictics=pingStatictics.substring( start+ 1,start+5);

                try{

                    // populate the array
                    float temp=Float.parseFloat(pingStatictics);
                    time[packetCount++]=temp;

                }catch (NumberFormatException e) {

                }
            }

            //destroy the generated process
            p.destroy();

            //sorting the array to get the median
            Arrays.sort(time);

            // for 10 packet 4th index will hold the median in a sorted array
            System.out.println("Median of the time tacken for 10 packets: "+time[4]);

        } catch (Exception e) {
            System.out.println("enter valid host name");
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the host address: ");
        Scanner in = new Scanner(System.in);
        String host_address = in.nextLine();
        runSystemCommand("ping " + host_address);
    }
}