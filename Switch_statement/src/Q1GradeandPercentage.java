import java.util.Scanner;

/*1. Using switch statement Write a JAVA program to input marks of five subjects Physics,
Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/
public class Q1GradeandPercentage {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the marks of physics:: ");
            double physics = scanner.nextDouble();

            System.out.print("Enter the marks of chemistry:: ");
            double chemistry = scanner.nextDouble();

            System.out.print("Enter the marks of biology:: ");
            double biology = scanner.nextDouble();

            System.out.print("Enter the marks of mathematics:: ");
            double mathematics = scanner.nextDouble();

            System.out.print("Enter the marks of computer:: ");
            double computer = scanner.nextDouble();

            double marks = (computer + mathematics + biology + chemistry + physics) / 5;

            switch ((marks >= 90) ? 1 : (marks >= 80) ? 2 : (marks >= 70) ? 3 : (marks >= 60) ? 4 : (marks >= 40) ? 5 : (marks < 40) ? 5 : 0) {

                case 1:
                    System.out.print("Grade A");
                    break;
                case 2:
                    System.out.print("Grade B");
                    break;
                case 3:
                    System.out.print("Grade C");
                    break;
                case 4:
                    System.out.print("Grade D");
                    break;
                case 5:
                    System.out.print("Grade E");
                    break;
                case 6:
                    System.out.print("Grade F");
                    break;
            }

        }
    }