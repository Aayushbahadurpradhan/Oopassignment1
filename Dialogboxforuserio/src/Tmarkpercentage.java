import javax.swing.*;

public class Tmarkpercentage {
    public static void main(String[] args) {
        double math,eng,comp,total,percentage,b;
        String last;
        b=100;
        math=Integer.parseInt(JOptionPane.showInputDialog(null,"Maths"));
        System.out.println(math<100 && math<b);
        eng=Integer.parseInt(JOptionPane.showInputDialog(null,"English"));
        System.out.println(eng<100 && eng<b);
        comp=Integer.parseInt(JOptionPane.showInputDialog(null,"Computer"));
        System.out.println(comp<100 && comp<b);
        total=math+eng+comp;
        percentage=total/3;
        System.out.println(percentage<100 && percentage<b);
        last = (total>=70.0) ? "First class" :(total>=59 && total<70) ? "Upper Second class" :(total>=49 && total <59) ? "Second class" : (total>=0 && total < 39) ? "Third class" : "Fail";
        JOptionPane.showMessageDialog(null,"The Total is:"+total+"\nThe percentage is"+percentage+"%"+"\nDivision:"+last);
    }
}
