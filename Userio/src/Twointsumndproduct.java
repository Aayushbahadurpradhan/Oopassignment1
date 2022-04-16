import java.util.Scanner;

public class Twointsumndproduct {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter first num");
        int first= scanner.nextInt();
        System.out.print("enter a second num");
        int second= scanner.nextInt();
        int sum= first+second;
        System.out.println("The sum is"+sum);
        int product = first*second;
        System.out.println("the product"+product);
    }
}
