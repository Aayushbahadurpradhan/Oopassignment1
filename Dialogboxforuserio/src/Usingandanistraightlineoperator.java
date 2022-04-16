import javax.swing.*;

public class Usingandanistraightlineoperator {
    public static void main(String[] args) {
        int a,b,c;
        String d;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"first num:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"second num:"));
        c=Integer.parseInt(JOptionPane.showInputDialog(null,"third num:"));
        d=(a==b && a==c)?"All are equal":(a==c||c==b)?"Two are equal":(a==b||c==b)?"Two are equal":"All three are not equal";
        System.out.println(d);
        JOptionPane.showMessageDialog(null,"the input data is:"+d);
    }
}
