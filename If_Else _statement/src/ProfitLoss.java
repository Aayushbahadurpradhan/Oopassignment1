/*18. Write a JAVA program to calculate profit or loss.*/
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String args[])    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Costprice ");
        double costp=s.nextDouble();
        System.out.println("Enter the Selling price:");
        double sellp=s.nextDouble();

        if(costp-sellp>0)
        {
            System.out.println("loss:" +(costp-sellp));
        }
        else if(costp-sellp<0)
        {
            System.out.println("profit:" +(sellp-costp));
        }
        else
            System.out.println("constant nor profit nor loss");

    }
}
