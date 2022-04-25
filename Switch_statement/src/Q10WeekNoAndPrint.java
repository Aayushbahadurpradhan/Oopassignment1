/*10. JAVA Program to take the value from the user as an input week number and print weekday by
using the switch statement. */
import java.util.Scanner;
public class Q10WeekNoAndPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a num:");
        int Day = scanner.nextInt();
        switch (Day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break; default:
                System.out.println("Invalid");
                break;
        }
    }
}