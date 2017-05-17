

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConversionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConversionTest
{
    /*@Test
    public void binaryOfZeroIsZero()
    {
        int [] binaryArray = Conversion.toBinaryArray(0);
        assertArrayEquals(new int [] {0}, binaryArray);
    }
    @Test
    public void binaryOfTwoIs1_0()
    {
        int [] binaryArray = Conversion.toBinaryArray(2);
        assertArrayEquals(new int [] {0, 1}, binaryArray);
    }
    @Test
    public void binaryOf129Is1_0_0_0_0_0_0_1()
    {
        int [] expected = {1,0,0,0,0,0,0,1};
        assertArrayEquals(expected, Conversion.toBinaryArray(129));
    }*/
    @Test
    public void lenghtOf0is1()
    {
        int expected = 1;
        assertEquals(1, Conversion.calculateLenght(0));
    }
}
