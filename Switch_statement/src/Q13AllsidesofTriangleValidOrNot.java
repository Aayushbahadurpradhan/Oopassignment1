import java.util.Scanner;

/*13. JAVA Program to take the value from the user
 as input all sides of a triangle and check whether
the triangle is valid or not. Using switch statement
*/
public class Q13AllsidesofTriangleValidOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first side: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second side: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second side: ");
        double c = scanner.nextDouble();

        switch ((a+b>c)||(a+c>b)||(b+c>a)?1:2){
            case 1:
                System.out.print("The triangle is valid.");
            case 2:
                System.out.print("The triangle is not valid.");
        }

    }
}
