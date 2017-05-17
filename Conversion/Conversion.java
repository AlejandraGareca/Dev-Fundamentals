
/**
 * Write a description of class Conversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conversion
{
    public static int[] toBinaryArray(int n){
        int lenght = calculateBinaryArraySize(n);
        int [] binaryArray = new int [lenght];
        for(int index = lenght -1; index >=0; index--)
        {
            binaryArray[index] = n % 2;
            n = n/2;
        }
        return binaryArray;
    }
    public static int calculateBinaryArraySize (int n)
    {
        int lenght = 1;
        while (n > 1)
        {
            lenght++;
            n = n/2;
        }
        return lenght;
    }
    public static void swapExtremeBits (int [] array)
    {
        int j = array.length-1;
        int aux = 0;
        for (int i = 0; i < (array.length/2); i++)
        {
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;
            j--;
        }
    }
    public static int toDecimal (int [] binaryArray)
    {
        int result = 0;        
        for(int exp = 0,i = binaryArray.length -1; i>=0; i--,exp++)
        {
            result = result + (binaryArray[i]*(int)(Math.pow(2,exp)));            
        }
        return result;
    }
} 
