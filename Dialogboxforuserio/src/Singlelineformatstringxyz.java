import javax.swing.*;

public class Singlelineformatstringxyz {
    public static void main(String[] args) {
        String name,roll,interest;
        name= JOptionPane.showInputDialog("name");
        roll= JOptionPane.showInputDialog("roll");
        interest= JOptionPane.showInputDialog("interest");
        System.out.println("name");
        System.out.println("roll");
        System.out.println("address");
        JOptionPane.showMessageDialog(null,"Hey,my name is "+name+" and my roll number is "+roll+"."+"My field of interest are "+interest+".");
    }
}
