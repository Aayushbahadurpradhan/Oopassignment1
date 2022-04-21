/*10. Write a JAVA program to check whether a
 character is uppercase or lowercase alphabet.*/
import java.util.Scanner;
public class UppercaeOrLowercase10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char character = scanner.next().charAt(0);
        if (character >= 'a' && character <= 'z'){
            System.out.println(character + " is an Lowercase.");
        } else {
            System.out.println(character + " is an Uppercase.");
        }
    }
}
