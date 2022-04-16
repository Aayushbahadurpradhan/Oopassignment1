import javax.swing.*;

public class Sumfournum {
    public static void main(String[] args) {
        int a,b,c,d,sum;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter first num"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter second num"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third num"));
        d=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter fourth num"));
        sum=a+b+c+d;
        JOptionPane.showMessageDialog(null,"The sum is:"+sum);
    }
}
