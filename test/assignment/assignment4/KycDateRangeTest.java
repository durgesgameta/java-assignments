package assignment.assignment4;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

import static assignment.assignment4.KycDateRange.getRange;
import static org.junit.jupiter.api.Assertions.*;

class KycDateRangeTest {

        @Test
        public  void getRangeTest1(){

            Calendar signUpCalender = Calendar.getInstance();
            Calendar currentCalender = Calendar.getInstance();
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String signDate="16-07-1998";
            String curDate= "27-06-2017";
            try {
                signUpCalender.setTime(df.parse(signDate));
                currentCalender.setTime(df.parse(curDate));
                List<String> result=getRange(signUpCalender,currentCalender);
                List<String> expected = new Vector<String>();
                expected.add("16-06-2017");
                expected.add("27-06-2017");
                assertEquals(expected,result);
            }catch (Exception e){
                System.out.println("enter correct date");
            }
        }

    @Test
    public  void getRangeTest2(){

        Calendar signUpCalender = Calendar.getInstance();
        Calendar currentCalender = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String signDate="16-07-1998";
        String curDate= "27-06-2017";
        try {
            signUpCalender.setTime(df.parse(signDate));
            currentCalender.setTime(df.parse(curDate));
            List<String> result=getRange(signUpCalender,currentCalender);
            List<String> expected = new Vector<String>();
            expected.add("02-06-2017");
            expected.add("27-06-2017");
            assertEquals(expected,result);
        }catch (Exception e){
            System.out.println("enter correct date");
        }
    }

    @Test
    public  void getCalenderTest1(){
        Calendar signUpCalender = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String signDate="16-07-1998";
        try{
            signUpCalender.setTime(df.parse(signDate));
            assertEquals("16-07-1998",KycDateRange.getCalendar(signUpCalender));
        }catch (Exception e){
            System.out.println("enter correct date");
        }

    }

    @Test
    public  void getCalenderTest2(){
        Calendar signUpCalender = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String signDate="16-07-1998";
        try{
            signUpCalender.setTime(df.parse(signDate));
            assertEquals("05-07-1998",KycDateRange.getCalendar(signUpCalender));
        }catch (Exception e){
            System.out.println("enter correct date");
        }

    }
}