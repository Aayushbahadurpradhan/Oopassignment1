import java.util.Scanner;

public class MonthNoToPrintDaysInThatMonth12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month Number;");
        int MonthNumber= scanner.nextInt();
        System.out.println("Enter year");
        int year =scanner.nextInt();
        if(MonthNumber == 1) {
            System.out.println("January=31Days");
        } else if(MonthNumber == 2) {
            if ((year%400==0 || year%4==0 && year%100!=0)) {
                System.out.println("29 days");
            }else {
                System.out.println("28 days");
            }
            System.out.println("February=28or29Days");
        } else if(MonthNumber== 3) {
            System.out.println("March=31Days");
        } else if(MonthNumber == 4) {
            System.out.println("April=30Days");
        } else if(MonthNumber == 5) {
            System.out.println("May=31days");
        } else if(MonthNumber == 6) {
            System.out.println("June=30days");
        } else if(MonthNumber== 7) {
            System.out.println("July=31Days");
        } else if(MonthNumber == 8) {
            System.out.println("August=31Days");
        } else if(MonthNumber== 9) {
            System.out.println("September=30Days");
        } else if(MonthNumber == 10) {
            System.out.println("October=31Days");
        } else if(MonthNumber == 11) {
            System.out.println("November=30Days");
        } else if(MonthNumber == 12) {
            System.out.println("December=31Days");
        } else {
            System.out.println("No other months");
        }
    }
}