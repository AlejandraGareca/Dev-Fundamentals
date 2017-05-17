

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FactorialTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FactorialTest
{
    @Test
    public void factorialOfZeroIsOne(){
        int expected = 1;
        int calculated = Functions.calcularFactorial(0);
        assertEquals(expected, calculated );
    }
}
