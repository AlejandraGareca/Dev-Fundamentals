

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CapicuaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CapicuaTest
{
    @Test
    public void anyNumberWithOneDogitIsCapicua()
    {
        //assertEquals(true,Factorial.capicua(0));
        assertTrue(Functions.capicua(5));
    }
    @Test
    public void aNumberWithTwoDigitsIsCapicuaIfBothDigitsAreEqual()
    {
        assertTrue(Functions.capicua(33));
        assertTrue(Functions.capicua(66));
    }
    @Test
    public void aNumberWithTwoDigitsIsNotCapicuaIfBothDigitsAreNotTheSame()
    {
        assertFalse(Functions.capicua(10));
        assertFalse(Functions.capicua(23));
    }
    @Test
    public void aNumberIsCapicuaIfItHasTheSameDigitsReadFromLeftToRightOrViceversa()
    {
        assertTrue(Functions.capicua(123321));
        assertTrue(Functions.capicua(40033004));
    }
    @Test
    public void invertDigitMethodReturnsANumberInverted()
    {
        int number = 12345;
        int inverted = Functions.invertDigit(number);
        int expected = 54321;
        assertEquals(expected, inverted);
    }
}
