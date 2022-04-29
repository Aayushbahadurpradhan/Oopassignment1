/*4. wap to take the initialization and
condition for the for loop and print the
 sum of all the even num */

import java.util.Scanner;

public class SumOfEvenNUm {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the starting num");
        int a= scanner.nextInt();
        System.out.println("enter ending num");
        int b= scanner.nextInt();
        int c=0;
        for (int i=a; i<=b;i+=2){
            System.out.println(i);
            c=c+i;
        }
        System.out.println("sum="+c);
    }
}