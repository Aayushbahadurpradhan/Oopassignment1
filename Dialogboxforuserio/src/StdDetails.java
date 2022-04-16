import javax.swing.*;

public class StdDetails {
    public static void main(String[] args) {
        String fullname,address,sec;
        fullname= JOptionPane.showInputDialog("Full name");
        address= JOptionPane.showInputDialog("Address");
        sec= JOptionPane.showInputDialog("Section");
        System.out.println(fullname);
        System.out.println(address);
        System.out.println(sec);
        JOptionPane.showMessageDialog(null,"Name:"+fullname+"\n Address: "+address+"\n Section:"+sec);
    }
}
