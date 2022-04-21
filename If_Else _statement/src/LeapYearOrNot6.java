/*
6. Write a JAVA program to check
 whether a year is leap year or not.
 */
import java.util.Scanner;
public class LeapYearOrNot6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year= scanner.nextInt();
        if (year%400==0 || year%4==0 && year%100!=0){ //year%4==0 gara ni hunxa
            System.out.println("It is Leap Year");
        }else{
            System.out.println("It is not Leap Year");
        }
    }
}
