import java.util.Scanner;

public class Stddetails {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your fullname:");
        String fullname= scanner.nextLine();
        System.out.print("Enter your address:");
        String address= scanner.nextLine();
        System.out.print("Enter your sec:");
        String sec= scanner.next();
        System.out.print("Enter your DOB:");
        String dob= scanner.next();
        System.out.println("Name:"+fullname);
        System.out.println("Address:"+address);
        System.out.println("Details:"+sec);
        System.out.println("Enter your DOB:"+dob);
    }
}
