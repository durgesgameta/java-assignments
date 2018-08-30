package assignment.assignment2;

import assignment.assignment4.KycDateRange;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class CheckAlphaPresenseTest {

    @Test
    public void containAllAlphabateTest1() {
        assertEquals(1,CheckAlphaPresense.containAllAlphabate("zxcvbnmlkjhgfdsaqwertyuiop"));

    }
    @Test
    public void containAllAlphabateTest2() {
        assertEquals(1,CheckAlphaPresense.containAllAlphabate("cvbtyuiop"));

    }
}