import javax.swing.*;

public class Variableoftwotrue {
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"num"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"second num"));
        JOptionPane.showMessageDialog(null,"the condition is:"+(a<50 && a<b));
    }
}
