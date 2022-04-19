/*14.Write a JAVA program to input angles
of a triangle and check whether triangle is valid or not.
 */
import java.util.Scanner;
public class AnglesofTriangeValidOrNot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first angle");
        int a= scanner.nextInt();
        System.out.println("Enter second angle");
        int b= scanner.nextInt();
        System.out.println("Enter third angle");
        int c= scanner.nextInt();
        int d= a+b+c;
        if (d == 180){
            System.out.println("Valid");
        }else {
            System.out.println("invalid");
        }
    }
}
