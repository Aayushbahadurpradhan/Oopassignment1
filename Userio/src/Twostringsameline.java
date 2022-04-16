import java.util.Scanner;

public class Twostringsameline {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first string");
        String first= scanner.nextLine();
        System.out.println("Enter second string");
        String second= scanner.nextLine();
        String third= first+second;
        System.out.println(third);
    }
}
