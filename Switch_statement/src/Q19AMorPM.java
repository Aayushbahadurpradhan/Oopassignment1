import java.util.Scanner;

/*19. Program to take the hours and minutes as input by the user and the show that whether it is AM
or PM by using the switch statement. */
public class Q19AMorPM {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scan.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scan.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }

}
