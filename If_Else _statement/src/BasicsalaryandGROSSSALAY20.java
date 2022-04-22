import java.util.Scanner;

/*20. Write a JAVA program to input basic salary of an employee and calculate its Gross salary
according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
*/
public class BasicsalaryandGROSSSALAY20 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your basic salary: ");
        double basic_salary= scanner.nextDouble();
        if ( basic_salary<=10000){
            double grossSalary = basic_salary +0.2*basic_salary+0.8*basic_salary;
            System.out.println(grossSalary);
        }else if (basic_salary<= 20000){
            double grossSalary = basic_salary +0.25*basic_salary+0.9*basic_salary;
            System.out.println(grossSalary);
        }else if (basic_salary>20000){
            double grossSalary = basic_salary +0.3*basic_salary+0.95*basic_salary;
            System.out.println(grossSalary);
        }else {
            System.out.println("Invalid data");
        }
    }
}
