
/*1.Wap to print te first 10 multiple of 2*/
import java.util.Scanner;

public class MUltiplicationTable {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the num u want multipicayion of :");
        int a= scanner.nextInt();
        for (int i=0 ;i<=10;i++){
            System.out.println(""+i+"x"+a+"="+i*a);
        }
    }
}
