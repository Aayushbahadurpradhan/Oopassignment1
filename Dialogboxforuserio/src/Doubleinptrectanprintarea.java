import javax.swing.*;

public class Doubleinptrectanprintarea {
    public static void main(String[] args) {
        double l,b,area;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Length"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Breadth"));
        area=l*b;
        JOptionPane.showMessageDialog(null,"The area is: "+(int)area);

    }
}
