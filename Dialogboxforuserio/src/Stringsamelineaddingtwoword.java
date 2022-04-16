import javax.swing.*;

public class Stringsamelineaddingtwoword {
    public static void main(String[] args) {
        String a,b,c;
        a= JOptionPane.showInputDialog("Enter a word");
        b= JOptionPane.showInputDialog("Enter a second word");
        c=a+b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        JOptionPane.showMessageDialog(null,"String: "+c);
    }
}
