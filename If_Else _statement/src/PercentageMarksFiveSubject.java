/*9. Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
import java.util.Scanner;

public class PercentageMarksFiveSubject {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks of Physics");
        double phy = scanner.nextDouble();
        System.out.println("Enter marks of Chemistry");
        double chem=scanner.nextDouble();
        System.out.println("Enter marks of Biology");
        double bio=scanner.nextDouble();
        System.out.println("Enter marks of Mathematics");
        double math= scanner.nextDouble();
        System.out.println("Enter marks of Computer");
        double comput = scanner.nextDouble();
        double total= phy+chem+bio+math+comput;
        double percentage = total/5;
        if (percentage>=90){
            System.out.println("Grade A");
        } else if (percentage >= 80){
            System.out.println("Grade B");
        } else if (percentage >= 70){
            System.out.println("Grade C");
        } else if (percentage >= 60){
            System.out.println("Grade D");
        } else if (percentage >= 40){
            System.out.println("Grade E");
        } else if (percentage < 40)
        {
            System.out.println("Grade F");
        }
    }
}
