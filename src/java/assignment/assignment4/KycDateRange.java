package assignment.assignment4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class KycDateRange {

    static List<String> getRange(Calendar signUpCalender,Calendar currentCalender)
    {

        // get the aniversery of the signup date in this year by adding the diff of the years of the two date
        signUpCalender.add(signUpCalender.YEAR,currentCalender.get(Calendar.YEAR)-signUpCalender.get(Calendar.YEAR));

        //leftRange & rightRange will hold the left and right extreme of the range
        Calendar leftRange = Calendar.getInstance();
        Calendar rightRange = Calendar.getInstance();

        //initialise the range object to aniversary date in current year
        leftRange.set(signUpCalender.get(Calendar.YEAR),signUpCalender.get(Calendar.MONTH),signUpCalender.get(Calendar.DATE));
        rightRange.set(signUpCalender.get(Calendar.YEAR),signUpCalender.get(Calendar.MONTH),signUpCalender.get(Calendar.DATE));

        //from the aniversary date decrease & increase the date by 30 days to get the window
        leftRange.add(leftRange.DATE,-30);
        rightRange.add(rightRange.DATE,30);

        //list which holds the result
        List<String> result = new Vector<String>();

        // for backdate if the current date is within the window then modify the window
        if(rightRange.compareTo(currentCalender)>0){
            result.add(getCalendar(leftRange));
            result.add(getCalendar(currentCalender));
            return result;
        }

        else{
            result.add(getCalendar(leftRange));
            result.add(getCalendar(rightRange));
            return result;
        }

    }


    // function to return the Calender object as String
    static String getCalendar(Calendar calendar)
    {
        // define output format and print
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date = sdf.format(calendar.getTime());
        return date;
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        // no of test cases
        int noTestCase=in.nextInt();
        String c=in.nextLine();

        while (noTestCase-- >0){

            // two Calender obj for two input each test case
            Calendar signUpCalender = Calendar.getInstance();
            Calendar currentCalender = Calendar.getInstance();

            // tacking input and separting on space t o get two dates as string
            String ip = in.nextLine();
            int spacePos=ip.lastIndexOf(" ");
            String signDate =ip.substring( 0,spacePos);
            String curDate = ip.substring(spacePos+1,ip.length());


            // object to parse the String date to date format
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            try{

                //initialization of the two objects of Calender
                signUpCalender.setTime(df.parse(signDate));
                currentCalender.setTime(df.parse(curDate));

                // if the signup year is same as current year then there is no range
                if(signUpCalender.get(Calendar.YEAR)==currentCalender.get(Calendar.YEAR)) System.out.println("No range");
                else {
                    List<String> result=getRange(signUpCalender,currentCalender);
                    System.out.println(result.get(0)+" "+result.get(1));
                }

            }catch(Exception exp){
                    System.out.println("enter the date in correct format");
            }


        }



    }
}
