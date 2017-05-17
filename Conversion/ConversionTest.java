

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
    @Test
    public void binaryOfZeroIsZero()
    {
        int [] binaryArray = Conversion.toBinaryArray(0);
        assertArrayEquals(new int [] {0}, binaryArray);
    }
    @Test
    public void binaryOfTwoIs1_0()
    {
        int [] binaryArray = Conversion.toBinaryArray(2);
        assertArrayEquals(new int [] {1, 0}, binaryArray);
    }
    @Test
    public void binaryOf129Is1_0_0_0_0_0_0_1()
    {
        int [] expected = {1,0,0,0,0,0,0,1};
        assertArrayEquals(expected, Conversion.toBinaryArray(129));
    }
    @Test
    public void calculateSizeOfBinaryArrayOfZero()
    {
           assertEquals(1, Conversion.calculateBinaryArraySize(0));
    }
    @Test
    public void calculateSizeOfBinaryArrayOf11()
    {
           assertEquals(4, Conversion.calculateBinaryArraySize(11));
    }
    @Test
    public void swapExtremesOfAnArrayWithOnlyTwoElements()
    {
        int[] expected = new int [] {1,1};
        int[] array = new int [] {1,1};
        Conversion.swapExtremeBits(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void swapExtremesOfAnArrayWithOnlyThreeElements()
    {
        int[] expected = new int [] {0,0,1};
        int[] array = new int [] {1,0,0};
        Conversion.swapExtremeBits(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void swapExtremesOfAnArrayWithOnlyFourElements()
    {
        int[] expected = new int [] {0,0,0,1};
        int[] array = new int [] {1,0,0,0};
        Conversion.swapExtremeBits(array);
        assertArrayEquals(expected, array);
    }
    @Test(timeout = 0)
    public void convertBinaryArrayToDecimal1_to_1()
    {
        assertEquals(1, Conversion.toDecimal(new int []{1}));
    }
    @Test(timeout = 0)
    public void convertBinaryArrayToDecimal1_1_0_to_6()
    {
        assertEquals(6, Conversion.toDecimal(new int []{1,1,0}));
    }
}
