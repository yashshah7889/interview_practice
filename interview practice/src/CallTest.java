import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CallTest {

    // Test Ideas:
    /*
    1. Need a test where the days are in the same month and verify we get the correct amount in between
    2. Need a test where the days are the same
    3. Need tests that revolve around February and the days in that month
    4. Need tests where months are only 1 month apart, not triggering the for loop
    5. Need tests where months are > 1 month apart
     */

    // Testing two days in the same month
	@Test public void daysInSameMonth(){
        assertEquals("Test Failed", 4, Call.cal(1, 16, 1, 20, 2022));
    }
	
	@Test public void daysForleap(){
        assertEquals("Test Failed", 59, Call.cal(1, 16, 3, 15, 2020));
    }
	@Test public void daysForOneMonthApart(){
        assertEquals("Test Failed", 29, Call.cal(4, 16, 5, 15, 2022));
    }
    @Test public void daysInDifferentMonth(){
        assertEquals("Test Failed", 58, Call.cal(1, 16, 3, 15, 2022));
    }

    @Test public void daysAreTheSame(){
        assertEquals("Test Failed", 0, Call.cal(1, 4, 1, 4, 2022));
    }

}