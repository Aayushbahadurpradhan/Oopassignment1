/*4. JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
statement.*/
import java.util.Scanner;

public class Q4Divisibleby5and11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        int remainder5 = a%5;
        int remainder11 = a%11;
        switch (remainder5){
            case 0:
                System.out.println("It is divisible");
                break;
            default:
                System.out.println("It is not divisible");
                break;

        }
    }
}
