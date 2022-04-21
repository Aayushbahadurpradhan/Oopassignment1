/*
5. Write a JAVA program to
 check whether a number is even or odd.
*/
import java.util.Scanner;
public class OddOrEven5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= scanner.nextInt();
        if (num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
