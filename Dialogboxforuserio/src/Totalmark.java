import javax.swing.*;

public class Totalmark {
    public static void main(String[] args) {
        double sci,math,eng,comp,total,percentage;
        String last;
        sci=Integer.parseInt(JOptionPane.showInputDialog(null,"Science"));
        math=Integer.parseInt(JOptionPane.showInputDialog(null,"Maths"));
        eng=Integer.parseInt(JOptionPane.showInputDialog(null,"English"));
        comp=Integer.parseInt(JOptionPane.showInputDialog(null,"Computer"));
        total=sci+math+eng+comp;
        percentage=total/4;
        last = (total>=70.0) ? "First class" :(total>=59 && total<70) ? "Upper Second class" :(total>=49 && total <59) ? "Second class" : (total>=0 && total < 39) ? "Third class" : "Fail";
        JOptionPane.showMessageDialog(null,"The Total is:"+total+"\nThe percentage is"+percentage+"%"+"\nDivision:"+last);
    }
}
