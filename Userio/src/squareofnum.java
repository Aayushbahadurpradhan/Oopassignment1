import java.util.Scanner;

public class squareofnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int squa = num*num;
        System.out.println("The square of "+num+" is "+squa+".");
    }
}
