/*1.WAP TO CREATE FUNCTION WHICH ACCEPTS ARRAY AS AN
 PARAMETER AND U NEED TO COUNT
 ALL THOSE NUMBERS WHICH ARE THE FACTORS OF 2.*/

import java.util.Arrays;
import java.util.Scanner;

public class AccpetsArrayAsANParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want in the array: ");
        int num = scanner.nextInt();
        int[] ar = new int[num];
        for(int i =0; i<ar.length;i++){
            System.out.print("Enter the number: ");
            ar[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(countFactor(ar));

    }
    public static int countFactor(int[] args){
        int count=0;
        for(int i=0;i<args.length;i++){
            if(args[i]==1||args[i]==2){
                count++;
            }
        }
        return count;
    }
}
