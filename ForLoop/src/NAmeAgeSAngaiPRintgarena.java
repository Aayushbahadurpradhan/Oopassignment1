
/*wap to take your name and age as user input
 and print it 5 times using for loop*/
import java.util.Scanner;

public class NAmeAgeSAngaiPRintgarena {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your name");
        String na= scanner.nextLine();
        System.out.println("enter your age");
        int a= scanner.nextInt();
        for (int i=1;i<=5;i++){
            System.out.println(""+a+"and"+na);
        }
    }
}
