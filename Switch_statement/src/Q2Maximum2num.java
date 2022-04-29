import java.util.Scanner;

/*2. JAVA Program to
find the maximum between two numbers. Using the switch statement*/
public class Q2Maximum2num {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        switch ((a <b) ? 0 : (b < a) ? 1 : 2) {
            case 0:
                System.out.println(b + " is greater");
                break;
            case 1:
                System.out.println(a + " is greater");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
