import java.util.Scanner;

/*7. JAVA Program to take the value from the user as
input any alphabet and check whether it is
vowel or consonant. Using the switch statement.*/
public class Q7VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the character:: ");
        char ch = scanner.next().charAt(0);
        switch ((ch =='a'|| ch =='e' || ch =='i'|| ch =='o'||ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == '0' || ch == 'U' )?1:0){
            case 1:
                System.out.print("The character is a vowel.");
                break;
            case 0:
                System.out.print("The character is a constant.");
                break;
        }
    }
}
