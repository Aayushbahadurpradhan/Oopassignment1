import java.util.Scanner;

/*18. JAVA Program to take the value from the user as input electricity unit charges and calculate
total electricity bill according to the given condition: For the first 50 units Rs.
0.50/unit………….For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit
……………For unit above 250 Rs. 1.50/unit………An additional surcharge of 20% is added to
the bill…….Using the switch statement. */
public class Q18ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double amount,sur,bill;

        System.out.println("Enter the electricity unit charges:");
        double unit= scanner.nextDouble();

        switch ( (unit<=50)?1:(unit<=150)?2:(unit<=250)?3:0) {


            case 1:
                amount = unit * 0.5;
                sur = amount * 0.2;
                bill = amount + sur;
                System.out.println("The total bill is " + bill);
                break;

            case 2:
                amount = 25 + (unit - 50) * 0.75;
                sur = amount * 0.2;
                bill = amount + sur;
                System.out.println("the total bill is" + bill);
                break;

            case 3:
                amount = 25 + 75 + (unit - 150) * 1.20;
                sur = amount * 0.2;
                bill = amount + sur;
                System.out.println("total bill is " + bill);
                break;

            case 4:
                amount = 25 + 75 + 150 + (unit - 250) * 1.50;
                sur = amount * 0.2;
                bill = amount + sur;
                System.out.println("total bill is " + bill);
                break;

            default:
                System.out.println("invalid");


        }
    }
}
