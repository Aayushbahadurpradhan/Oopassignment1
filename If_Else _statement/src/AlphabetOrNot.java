/*
7. Write a JAVA program to check whether a
character is alphabet or not.
*/
import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args) {
        char alphab;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        alphab = scanner.next().charAt(0);
        if((alphab>='a' && alphab<='z') || (alphab>='A' && alphab<='Z')){
            System.out.print(alphab + " is an alphabet.");
        }else{
            System.out.print(alphab + " is not an alphabet.");
        }
    }
}
