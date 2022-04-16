import java.util.Scanner;

public class rectarea {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("enter Length:");
        double length= scanner.nextInt();
        System.out.print("enter a breadth");
        double breadth= scanner.nextInt();
        double area=length*breadth;
        System.out.println("the area is:"+(int)area);
    }
}
