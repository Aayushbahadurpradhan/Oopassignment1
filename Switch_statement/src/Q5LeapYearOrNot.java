/*4. JAVA Program to check whether a number
 is divisible by 5 and 11 or not. Using the switch
statement.*/
import java.util.Scanner;

public class Q5LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int a = scanner.nextInt();
        int leap= a%4;
        int leap1 = a%400;
        int leap2 = a%100;
        switch (leap){
            case 0:
                System.out.println("It is leap year");
                break;
            default:
                System.out.println("It is not leap year");
                break;

        }
    }
}
