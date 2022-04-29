import java.util.Scanner;

/*3. Wap to take the initialization and condition for the for loop and print the even numbers present between it.*/
public class AskUserStartingAndEndingNumandprintevenAnOdd {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the starting num");
        int a= scanner.nextInt();
        System.out.println("enter ending num");
        int b= scanner.nextInt();
        for (int i=a; i<=b;i+=2){
            System.out.println(i);
        }
    }
}
