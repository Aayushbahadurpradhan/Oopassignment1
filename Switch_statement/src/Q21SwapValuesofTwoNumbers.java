import java.util.Scanner;

/*21. Write a program to swap the values of two numbers
 if the values of both variables are not the
same using a switch statement. */
public class Q21SwapValuesofTwoNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double temp;
            System.out.println("Enter the first no:");
            double a=scanner.nextDouble();
            System.out.println("Enter the second no:");
            double b=scanner.nextDouble();
            temp=a;
            a=b;
            b=temp;
            switch((a!=b)?1:(a==b)?2:3){
                case 1:
                    System.out.println("a="+a);
                    System.out.println("b="+b);
                    break;
                case 2:
                    System.out.println("Don't take two same no");
                    break;
                case 3:
                    System.out.println("invalid");
                    break;
            }


        }

    }