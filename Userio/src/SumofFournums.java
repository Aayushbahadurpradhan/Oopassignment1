import java.util.Scanner;

public class SumofFournums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first num");
        double first= scanner.nextInt();
        System.out.print("enter a second num");
        double second= scanner.nextInt();
        System.out.print("enter a third num");
        double third= scanner.nextInt();
        System.out.print("enter a fourth num");
        double fourth= scanner.nextInt();
        double sum=first+second+third+fourth;
        System.out.println(sum);
        System.out.println("The sum 4 num is:" +sum);
    }
}
