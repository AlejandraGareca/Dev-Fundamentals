
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Functions
{
    public static int calcularFactorial(int n){
        int r = 1;
        for (int i=1; i<=n; i++)
        {
            r = r*i;
        }
        return r; 
    }
    public static boolean capicua (int n)
    {
       /* if (n / 10 == 0)
        {
            return true; 
        }
        else
        {*/
            return (n == invertDigit(n));
        //}
    }
    public static int invertDigit (int n)
    {
        int inverted = 0;
        while(n != 0){
            inverted = (inverted * 10) + n % 10;
            n = n/10;
        }
        return inverted;
    }
}
