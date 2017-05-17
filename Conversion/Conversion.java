
/**
 * Write a description of class Conversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conversion
{
    public static int[] toBinaryArray(int n){
        int lenght = calculateLenght(n);
        int [] binaryArray = new int [lenght];
        for (int i = lenght-1; n > 0; i--)
        {
            binaryArray[i] = n % 2;
            n = n/10;
        }
        return binaryArray;
    }
    public static int calculateLenght (int n)
    {
        boolean flag = false;
        int counter = 1;
        while (flag == false)
        {
            if ((n >= Math.pow(2, (counter-1)))&& (n < Math.pow(2, counter)))
            {
               flag = true;
            }
            else{
                counter++;
            }            
        }
        return counter;
    }
} 
