/*WAP TO CREATE A FUNCTION REVERSE A POSITIVE INTEGER NUMBER
 AND RETUrN IT
* SYNTAX OF THE FUNCTION IS
* STATIC INT REVERSE NUMBER (INT NUM)*/

import java.util.Arrays;

public class ReversePosiiveIntAndREturnIT {
    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
    }
    static int reverseNumber(int num){
        int rev=0;
        while(num!=0){
            int rem = num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;
    }
}
