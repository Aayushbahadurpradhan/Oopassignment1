/*15. Write a JAVA program to input all sides of a
triangle and check whether triangle is valid or not*/
import java.util.Scanner;
public class SidesofTriangeValidOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first angle");
        double a = scanner.nextDouble();
        System.out.println("Enter second angle");
        double b = scanner.nextDouble();
        System.out.println("Enter third angle");
        double c = scanner.nextDouble();
        if((a + b  >  c) &&(b +c > a) && (a +c > b)) {
            System.out.println("Valid Triangle");
        }	else 	{
            System.out.println("Not a Valid Triangle");
        }
    }
}
