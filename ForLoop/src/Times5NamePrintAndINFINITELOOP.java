import java.util.Scanner;

public class Times5NamePrintAndINFINITELOOP {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your name:");
        String a = scanner.nextLine();
        for (int i=0;i<=4;i++){ //5chadi print garena
            System.out.println(a);
        }
    }
}
class Afnoname{
    public static void main(String[] args) {
        for ( int i=0;i<=4;i++){
            System.out.println("aayush");
        }
    }
}

/*infinite time name loop*/
class Infinitename{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your name:");
        String a = scanner.nextLine();
        for (int i=0;i>=0;i++){ //5chadi print garena
            System.out.println(a);
        }
    }
}

//
class OfInfiniteForLoop {
    public static void main(String[] args) {
        int i = 1;
        for( ; ; )
        {
            System.out.println(i);
        }
    }
}