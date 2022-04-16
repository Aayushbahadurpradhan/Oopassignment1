import javax.swing.*;

public class SquareareaperimeterSiAotVoc {
    public static void main(String[] args) {
        int l,area,perimeter;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Length:"));
        area=l*l;
        perimeter= 4*l;
        JOptionPane.showMessageDialog(null,"Area of square:"+area+"\nPerimeter:"+perimeter);

    }
}

class Simple{
    public static void main(String[] args) {
        int p,t,r,Si;
        p=Integer.parseInt(JOptionPane.showInputDialog(null,"Principal:"));
        t=Integer.parseInt(JOptionPane.showInputDialog(null,"Time:"));
        r=Integer.parseInt(JOptionPane.showInputDialog(null,"Rate:"));
        Si=p*t*r/100;
        JOptionPane.showMessageDialog(null,"SimpleInterest:"+Si);
    }
}

class Triangle{
    public static void main(String[] args) {
        double b,h,area;
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Breadth:"));
        h=Integer.parseInt(JOptionPane.showInputDialog(null,"Height:"));
        area=(b*h)/2;
        JOptionPane.showMessageDialog(null,"Area of Triangle:"+area);

    }
}

class Volume{
    public static void main(String[] args) {
        double l,b,h,cube,cuboid;
        l=Integer.parseInt(JOptionPane.showInputDialog(null,"Length:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"Breadth:"));
        h=Integer.parseInt(JOptionPane.showInputDialog(null,"Height:"));
        cube=l*l*l;
        cuboid=l*b*h;
        JOptionPane.showMessageDialog(null,"Cube:"+cube+"\nCuboid"+cuboid);
    }
}