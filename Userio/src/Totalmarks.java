import java.util.Scanner;

public class Totalmarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b=100;
        System.out.println("Enter marks of Science:");
        double Sci = scanner.nextInt();
        System.out.println(Sci<100 && Sci<b);
        System.out.println("Enter marks of Maths:");
        double Math = scanner.nextInt();
        System.out.println("Enter marks of English:");
        double Eng = scanner.nextInt();
        System.out.println("Enter marks of Nepali:");
        double Nep = scanner.nextInt();
        double total;
        String last;
        total=(Sci+Math+Eng+Nep)/4;
        System.out.println("The total Percentage is:"+total);
        last = (total>=70.0) ? "First class" :(total>=59 && total<70) ? "Upper Second class" :(total>=49 && total <59) ? "Second class" : (total>=0 && total < 39) ? "Third class" : "Fail";
        System.out.println(last);
    }
}
