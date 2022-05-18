/*2. WAP TO CREATE A FUNCTION WHICH RETURNS  AN INTEGER ARRAY
 * NOTE: YOU HAVE TO ADD ONLY 10 ELEMENTS IN ITHE ARRAY*/


public class FunctionReturnsIntFunction {
    public static void main(String args[])
    {
        int[] a=numbers();
        for (int i = 0; i < a.length; i++)
            System.out.print( a[i]+ " ");
    }
    public static int[] numbers()
    {
        int[] arra={5,6,7,8,9};  //giving  arrays
        return arra;
    }
}