import java.util.Scanner;

/*21. Write a JAVA program to input electricity unit charges and calculate total electricity bill
according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/
public class ElectricityBill21 {
    public static void main(String[] args) {
        int Units;
        double Amount, Sur_charge, Total_Amount;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the units u have consumed: ");
        Units=scanner.nextInt();
        if (Units<=50){
            Amount= Units*0.5;
            Sur_charge= 0.2*Amount;
        }else if (Units<=150){
            Amount=25+((Units-50)*0.75);
            Sur_charge =0.2*Amount;
        }else if (Units<=250){
            Amount=25+75+((Units-150)*1.20);
            Sur_charge =0.2*Amount;
        }else {
            Amount=25+75+120+((Units-250)*1.50);
            Sur_charge=0.2*Amount;
        }
        Total_Amount = Amount+Sur_charge;
        System.out.println("\n Electricity bill ="+Total_Amount);
    }
}
