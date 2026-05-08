import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 *
<!--//# BEGIN TODO: Name, student ID, and date-->
Razzan Ikhsan Raisa, 2279118, 8/5/2026
<!--//# END TODO-->
 */
public class CandyTest {

    static final Candy SUT = null; // to simplify method calls

    static final long MAX_VALUE = 999999999999999999L;

    /**
     * Checks the result of SUT.divide(k, c).
     */
    private void check(long k, long c, boolean expected) {
        System.out.println("divide(" + k + ", " + c + ")");
        long result = SUT.divide(k, c);
        System.out.println("  result = " + result);
        assertEquals(expected, 0 <= result, "possible (0 <= result)");
        if (0 <= result) {
            assertTrue(result <= MAX_VALUE, "range (result <= MAX_VALUE)");
            assertEquals(result * k, c, "quotient (result * k == c)");
        }
    }

    // Test cases

    /** The given example. */
    @Test
    public void testDivideGivenExample() {
        check(3, 15, true);
    }

//# BEGIN TODO: Additional test cases
    @Test
    public void testDivideImpossibleRemainder() {
        check(3, 10, false);
    }

    @Test
    public void testDivideByZeroKids() {
        check(0, 15, false);
    }

    @Test
    public void testDivideMoreKidsThanCandies() {
        check(10, 5, false);
    }

    @Test
    public void testDivideZeroCandies() {
        check(5, 0, true);
    }

    @Test
    public void testDivideLargeValues() {
        long largeK = 1000000000L;
        long largeC = 200000000000000000L;
        check(largeK, largeC, true); 
    }
//# END TODO

}
