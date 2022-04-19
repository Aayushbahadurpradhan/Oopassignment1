import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter first num");
        double first= scanner.nextInt();
        System.out.print("enter a second num");
        double second= scanner.nextInt();
        double sum= first+second;
        System.out.println("The sum is"+sum);
        double product = first*second;
        System.out.println("the product"+product);
        double division = product/sum;
        System.out.println("The division"+division);
        double divi = sum/product;
        System.out.println("The divi"+divi);
//        int a= 4;
//        int b= 5;
//        int s= a+b;
//        int prod= a*b;
//        double castedS = (double) (s);
//        double castedprod = (double) (prod);
//        double finalresult  = (double) (prod);

    }
}
