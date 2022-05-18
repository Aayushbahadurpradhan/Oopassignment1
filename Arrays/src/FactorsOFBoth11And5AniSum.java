/*WAP TO CREATE A FUNCTION WHERE YOU HAVE
 ALL THE ELEMENTS WHICH ARE FACTORS OF BOTH 11 AND 5.
  HERE, YOU HAVE TO RETURN THUS OBTAINED SUM*/

import java.util.Arrays;
import java.util.Scanner;

public class FactorsOFBoth11And5AniSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element in the array: ");
        int num = scanner.nextInt();
        int[] a = new int[num];
        for(int i= 0 ; i<a.length;i++){
            System.out.print("Enter the number: ");
            a[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sumFactor5n11(a));
    }
    public static int sumFactor5n11(int[] args){
        int sum=0;
        for(int i=0; i<args.length;i++){
            if(args[i]%5==0&&args[i]%11==0){
                sum+=args[i];
            }
        }
        return sum;

    }
}
