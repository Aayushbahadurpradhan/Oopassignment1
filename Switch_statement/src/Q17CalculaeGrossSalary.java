import java.util.Scanner;

/*17. JAVA Program to take the value from the user as input the basic salary of an employee and
calculate its Gross salary according to the following: Basic Salary <= 10000: HRA = 20%, DA =
80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA =
90%………………………………Basic Salary > 20000 : HRA = 30%, DA = 95%.
1*/
public class Q17CalculaeGrossSalary {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double salary=scanner.nextDouble();

        double HRA,DA;

        switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){

            case 1:
                System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                break;

            case 2:
                System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                break;

            case 3:
                System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                break;

            case 0:
                System.out.println("no thing");
                break;

            default:
                System.out.println("invalid");

        }

    }
}
