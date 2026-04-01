import javax.swing.*;

public class Maior {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "Maior: " + n1);
        } else {
            JOptionPane.showMessageDialog(null, "Maior: " + n2);
        }
    }
}