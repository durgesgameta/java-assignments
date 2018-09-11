package assignment.incremental2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VampireNumberTest {

    @Test
    void checkVampireNumberPos() {
        int arr[]={5,8,5,2,6,1};
        int size=6;
        int number=152685;
        assertEquals("585 261 152685",VampireNumber.checkVampireNumber(arr,size,number));

    }

    @Test
    void checkVampireNumberNeg() {
        int arr[]={3,5,6,4,3,1};
        int size=6;
        int number=153436;
        assertEquals("356 431 153437",VampireNumber.checkVampireNumber(arr,size,number));
    }

}
//585 261 152685