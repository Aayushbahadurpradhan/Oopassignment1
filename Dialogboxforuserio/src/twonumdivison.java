import javax.swing.*;

public class twonumdivison {
    public static void main(String[] args) {
            int a,b,sum,product,divison,divi;
            a=Integer.parseInt(JOptionPane.showInputDialog(null,"First Integer"));
            b=Integer.parseInt(JOptionPane.showInputDialog(null,"Second Integer"));
            sum=a+b;
            product=a*b;
            divison=product/sum;
            divi=sum/product;
            JOptionPane.showMessageDialog(null,"Sum:"+sum+"\nProduct:"+product+"\nDivision:"+divison+"\nDivi:"+divi);
    }
}
